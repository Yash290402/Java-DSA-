// Define a Solution class with a nested Node class to represent linked list nodes
class q1 {
    static class Node {
        int data;
        Node next;

        // Constructor to initialize node with data and next reference
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to find the intersection point of two linked lists
    public Node getIntersectionNode(Node head1, Node head2) {
        // Iterate through each node in the second linked list
        while (head2 != null) {
            Node temp = head1;
            // For each node in the second list, iterate through nodes in the first list
            while (temp != null) {
                // If a matching node is found, it indicates an intersection
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next; // Move to the next node in the first list
            }
            head2 = head2.next; // Move to the next node in the second list
        }
        return null; // No intersection point found
    }

    public static void main(String[] args) {
        q1 list = new q1();

        // Create two linked lists with some nodes
        Node head1, head2;
        head1 = new Node(10);
        head2 = new Node(3);

        // Create intersection point by connecting specific nodes of both lists
        Node newNode = new Node(6);
        head2.next = newNode;
        newNode = new Node(9);
        head2.next.next = newNode;
        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;
        newNode = new Node(30);
        head1.next.next = newNode;
        head1.next.next.next = null;

        // Find the intersection point of the lists
        Node intersectionPoint = list.getIntersectionNode(head1, head2);

        // Print the result
        if (intersectionPoint == null) {
            System.out.print(" No Intersection Point \n");
        } else {
            System.out.print("Intersection Point: " + intersectionPoint.data);
        }
    }
}

