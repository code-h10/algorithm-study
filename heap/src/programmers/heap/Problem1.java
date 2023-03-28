package programmers.heap;

import java.util.PriorityQueue;

public class Problem1 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        PriorityQueue<Integer> heap = new PriorityQueue();
        for (int i : scoville) {
            heap.offer(i);
        }

        int mixCount = 0;
        while(heap.peek() < K) {
            if (heap.size() < 2) {
                System.out.println("-1");
            }
            int firstElement = heap.poll();
            int secondElement = heap.poll();
            int mixed = firstElement + (secondElement * 2);
            heap.offer(mixed);
            mixCount++;
        }
        System.out.println("섞은 최대 수: " + mixCount);
    }
}
