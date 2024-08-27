import java.util.*;

public class student {

    static class StudentRank implements Comparable<StudentRank> {
        int rank;
        String name;

        public StudentRank(int rank, String name) {
            this.rank = rank;
            this.name = name;
        }

        @Override
        public int compareTo(StudentRank s2){
            return this.rank-s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<StudentRank> pq = new PriorityQueue<>(Comparator.reverseOrder()); //reverse order
        pq.add(new StudentRank(4,"A"));
        pq.add(new StudentRank(5,"B"));
        pq.add(new StudentRank(2,"C"));
        pq.add(new StudentRank(1,"D"));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();

        }
    }
}
