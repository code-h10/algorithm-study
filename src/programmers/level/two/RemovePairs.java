package programmers.level.one;
import java.util.*;

public class RemovePairs {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        
        int answer = stack.size() > 0 ? 0 : 1;
        System.out.println(answer);
    }
}
