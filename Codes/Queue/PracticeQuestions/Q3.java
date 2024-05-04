package PracticeQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

// We have an array of jobs where every job has a deadline and associated profit if the job is finished before the deadline.
// It is also given that every job takes a single unit of time,so the minimum possible deadline for any job is 1.Maximize the total profitif only one job can be scheduled at a time.

public class Q3 {
    static class Job {
        char job_id;
        int deadline;
        int profit;

        Job(char job_id, int deadline, int profit) {
            this.job_id = job_id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    static void printJobScheduling(ArrayList<Job> arr) {
        int n = arr.size();
        // Sort jobs based on deadlines
        Collections.sort(arr, Comparator.comparingInt(a -> a.deadline));

        ArrayList<Job> result = new ArrayList<>();

        // Priority queue to store jobs based on profit (maxHeap)
        PriorityQueue<Job> maxHeap = new PriorityQueue<>(Comparator.comparingInt(b -> b.profit));

        for (int i = n - 1; i >= 0; i--) {

            int slot_available;
            if (i == 0) {
                slot_available = arr.get(i).deadline;
            } else {
                slot_available = arr.get(i).deadline - arr.get(i - 1).deadline;
            }
            maxHeap.add(arr.get(i));

            // Add jobs to the result while there are available slots and jobs in the
            // maxHeap
            
            while (slot_available > 0 && !maxHeap.isEmpty()) {
                Job job = maxHeap.poll();
                slot_available--;
                result.add(job);
            }
        }
        // Sort result based on deadlines
        Collections.sort(result, Comparator.comparingInt(a -> a.deadline));
        // Print the sequence of jobs
        for (Job job : result) {
            System.out.print(job.job_id + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Job> arr = new ArrayList<>();
        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 19));
        arr.add(new Job('c', 2, 27));
        arr.add(new Job('d', 1, 25));
        arr.add(new Job('e', 3, 15));
        System.out.println("Following is the maximum profit sequence of jobs:");
        printJobScheduling(arr);
    }
}
