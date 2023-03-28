package programmers.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Problem2 {
    public static void main(String[] args) {

        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        int answer = 0;
        int time = 0;
        int index = 0;

        while (index < jobs.length || !queue.isEmpty()) {
            while (index < jobs.length && jobs[index][0] <= time) {
                queue.offer(jobs[index]);
                index++;
            }
            if (queue.isEmpty()) {
                time = jobs[index][0];
            } else {
                int[] job = queue.poll();
                answer += time + job[1] - job[0];
                time += job[1];
            }
        }
        System.out.println(answer / jobs.length);
    }
}
