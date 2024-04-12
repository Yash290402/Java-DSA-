
public class linkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {

        // step 1:create a new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2:newnode next=head
        newNode.next = head; // link

        // step 3:head=newnode
        head = newNode;
    }

    public void addlast(int data) {

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            tail = head = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    public void print() {

        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null ");
    }

    public void add(int index, int data) {

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newnNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        // i=index-1,temp-->prev
        newnNode.next = temp.next;
        temp.next = newnNode;

    }

    public int removefirst() {
        if (size == 0) {

            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {

            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removelast() {
        if (size == 0) {

            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev:i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    // linear search in ll

    public int search(int key) { // o(n)
        int i = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // recrusive method for search in linked list

    public int helper(Node head, int key) { // o(n)
        if (head == null)
            return -1;

        if (head.data == key)
            return 0;

        int idx = helper(head.next, key);
        if (idx == -1)
            return -1;

        return idx + 1;
    }

    public int recsearch(int key) {
        return helper(head, key);
    }

    public void reverse() { // o(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void deleteNthfromend(int n) {

        // calculate size
        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next; // remove first element
            return;
        }

        // sz-n
        int i = 1;
        int itoFind = sz - n;
        Node prev = head;
        while (i < itoFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // slow-fast approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow; // slow is my midNode
    }

    public boolean checkPalidrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step:1-find mid
        Node midNode = findMid(head);

        // step:2 -reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        // step:3 -check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    @SuppressWarnings("null")
    public static boolean detectCycles() { // floyad cycles detection
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    @SuppressWarnings("null")
    public static void removecycle() {

        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null; // last node

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle->last node ->null
        prev.next = null;

    }

    private Node getmid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    private Node merge(Node head1, Node head2) {
        Node mergell = new Node(-1);
        Node temp = mergell;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {

            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {

            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergell.next;
    }

    public Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getmid(head);

        // left & right MS
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(righthead);

        // merge
        return merge(newLeft, newRight);
    }

    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // 2nd half reverse
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left=head;
        Node right=prev;
        Node nextl,nextr;

        // alternate merge---zigzag merge
        while (left != null&&right != null) {
            nextl = left.next;
            left.next = right;
            nextr = right.next;
            right.next = nextl;

            left=nextl;
            right=nextr;
        }

    }

    public static void main(String[] args) {

        linkedlist ll = new linkedlist();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addlast(3);
        // ll.addlast(4);
        // ll.add(2, 9);
        // ll.print();
        // System.out.println(ll.size);
        // ll.removefirst();
        // ll.print();
        // ll.removelast();
        // ll.print();
        // System.out.println("key is on index:" + ll.search(3));
        // System.out.println("key is on index:" + ll.recsearch(9));

        // ll.reverse();
        // ll.deleteNthfromend(3);
        // ll.print();
        // System.out.println(ll.checkPalidrome());

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(detectCycles());
        // removecycle();
        // System.out.println(detectCycles());
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.print();
        // ll.head = ll.mergeSort(ll.head);

        ll.zigZag();
        ll.print();
        // ll.print();

    }
}
