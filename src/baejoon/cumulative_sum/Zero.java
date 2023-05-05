package baejoon.cumulative_sum;

import java.util.Stack;

public class Zero {
    public static void main(String[] args) {
        int[] n = {4, 0, 3, 0};
        int k = 4;
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < k; i++) {
            if(n[i] == 0 && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(n[i]);
            }
        }

        for(int j = 0; j < k; j++) {
            if(!stack.isEmpty()){
                sum += stack.pop();
            }
        }
        System.out.println(sum);

    }
}
