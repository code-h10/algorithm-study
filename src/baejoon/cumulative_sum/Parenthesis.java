package baejoon.cumulative_sum;

import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {

        char[] s = {'(', '(', ')', ')', '(', ')', ')'};

        int t = 1;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < t; i++) {
            stack.clear();
            for(int j = 0; j < s.length; j++) {
                if('(' == s[j]) {
                    stack.push(s[j]);
                }

                if(')' == s[j]) {
                    if(stack.isEmpty()) {
                        stack.push(s[j]);
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
