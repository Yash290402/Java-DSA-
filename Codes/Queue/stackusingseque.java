import java.util.Deque;
import java.util.LinkedList;

public class stackusingseque {
    static class stack {
        Deque<Integer> Deque = new LinkedList<>();

        public void push(int data) {
            Deque.addLast(data);
        }

        public int pop() {
            return Deque.removeLast();
        }

        public int peek() {
            return Deque.getLast();
        }
    }

    static class queue {
        Deque<Integer> Deque = new LinkedList<>();

        public void add(int data) {
            Deque.addLast(data);
        }

        public int remove() {
            return Deque.removeFirst();
        }

        public int peek() {
            return Deque.getFirst();
        }
    }

    public static void main(String[] args) {
        // stack s = new stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // System.out.println("peek is: " + s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

        queue q =new queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek is : " + q.peek());
    }
}
