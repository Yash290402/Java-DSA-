import java.util.ArrayList;

public class Insert {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last index

            arr.add(data);

            int x = arr.size() - 1; // x is chlid index
            int par = (x - 1) / 2; // par index

            while (arr.get(x) < arr.get(par)) { // o(logn)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void Heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minidx = i;

            if (left < arr.size() && arr.get(minidx) > arr.get(left)) {
                minidx = left;

            }

            if (right < arr.size() && arr.get(minidx) > arr.get(right)) {
                minidx = right;
            }

            if (minidx != i) {
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);

                Heapify(minidx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            // step1: swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step2: delete last
            arr.remove(arr.size() - 1);

            // step3: heapify
            Heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.add(3);
        heap.add(2);
        heap.add(1);
        heap.add(5);
        
        while (!heap.isEmpty()) {
            System.out.println(heap.peek());
            heap.remove();
        }
    }
}
