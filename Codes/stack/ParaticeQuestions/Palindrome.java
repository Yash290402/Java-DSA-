import java.util.*;

public class Palindrome {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // check linked list is palindrome or not using Stack data structure
    public boolean isPalindrome() {
        Stack<Integer> s = new Stack<>();
        Node current = head;

        // Push all elements of the linked list onto the stack
        while (current != null) {
            s.push(current.data);
            current = current.next;
        }

        // Traverse the linked list again and compare with the popped elements from the stack
        current = head;
        while (current != null) {
            int popped = s.pop();
            if (current.data != popped) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    public static void main(String[] args) {
        
        Palindrome ll = new Palindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(8);
        ll.addFirst(1);

        System.out.println(ll.isPalindrome());
    }
}
