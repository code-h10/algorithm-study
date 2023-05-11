package baejoon.cumulative_sum;

import java.util.Deque;
import java.util.LinkedList;
import java.util.StringJoiner;

public class JosephusProblem0 {
    public static void main(String[] args) {

        int n = 7;
        int k = 3;
        Deque<Integer> deque = new LinkedList<>();
        StringJoiner sj = new StringJoiner(", ", "<", ">");

        for(int i = 1; i <= n; i++) {
            deque.add(i);
        }

        while(!deque.isEmpty()) {
            for(int i = 1; i < k; i++) {
                int number = deque.poll();
                deque.offerLast(number);
            }
            sj.add(deque.poll().toString());
        }



        System.out.println(sj.toString());
    }
}
