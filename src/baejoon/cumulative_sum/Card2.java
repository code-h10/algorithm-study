package baejoon.cumulative_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Card2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            deque.offer(i);
        }

        while(deque.size() > 1) {

            deque.pollFirst();
            int first = deque.pollFirst();
            deque.offerLast(first);
        }
        System.out.println(deque.poll());
    }
}
