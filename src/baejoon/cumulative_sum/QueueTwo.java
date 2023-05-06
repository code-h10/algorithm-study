package baejoon.cumulative_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class QueueTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            String input = br.readLine();

            if(input.contains("push")) {
                queue.offer(Integer.parseInt(input.split(" ")[1]));
            } else if(input.contentEquals("pop")) {
                if(queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else if(input.contentEquals("size")) {
                sb.append(queue.size()).append("\n");
            } else if(input.equals("empty")) {
                if(queue.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if(input.contentEquals("front")) {
                if(queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.getFirst()).append("\n");
                }
            } else if(input.contentEquals("back")) {
                if(queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.getLast()).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
