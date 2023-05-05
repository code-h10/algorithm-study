package baejoon.cumulative_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        while(true) {
            String s = br.readLine();

            if(s.equals(".")) {
                break;
            }
            stack.clear();
            char[] c = s.toCharArray();
            for(int i = 0; i < c.length; i++) {

                if(c[i] == '(' || c[i] == '[') {
                    stack.push(c[i]);

                } else if(c[i] == ')') {
                    if(!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(c[i]);
                    }

                } else if(c[i] == ']') {
                    if(!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        stack.push(c[i]);
                    }
                }
            }

            if(stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
