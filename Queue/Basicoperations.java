
public class Basicoperations {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            rear = -1;
            size = n;
            front = -1;
            arr = new int[n];
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isfull() {
            return (rear + 1) % size == front;
        }

        // add
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        // add in circular Queue
        public static void addcircular(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            // add frist element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        // remove in circular queue
        public static int removecircular() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }

    }

    public static void main(String[] args) {

        Queue q = new Queue(3);
        // q.add(1);
        // q.add(2);
        // q.add(3);

        q.addcircular(1);
        q.addcircular(2);
        q.addcircular(3);
        System.out.println(q.removecircular());
        q.addcircular(4);
        System.out.println(q.removecircular());
        q.addcircular(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());

        }
    }
}
