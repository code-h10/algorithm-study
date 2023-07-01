package baejoon.queue;

import java.util.*;
import java.io.*;

public class Ac {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        StringBuilder result = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 1; i <= t; i++) {
            dq.clear();
            String p = br.readLine();
            boolean reverse = false;
            boolean error = false;
            int n = Integer.parseInt(br.readLine());
            String[] x = br.readLine().replace("[", "").replace("]", "").split(",");
              
            for(String s : x) {
                if(!s.isEmpty()) {
                    dq.add(Integer.parseInt(s));
                }
            }

            for(char c : p.toCharArray()) {
                if(c == 'R') {
                    reverse = !reverse;
                } else {
                    if(dq.isEmpty()) {
                        result.append("error").append(i == t ? "" : "\n");
                        error = true;
                        break;
                    }
                    if(reverse) {
                        dq.pollLast();
                    } else {
                        dq.pollFirst();
                    }
                }
            }
            if(error == false) {
                result.append("[");
                while(!dq.isEmpty()) {
                    result.append(reverse ? dq.pollLast() : dq.pollFirst());
                    if(!dq.isEmpty()) {
                        result.append(",");
                    }
                }
                result.append("]").append(i == t ? "" : "\n");
            }
        }
        System.out.println(result.toString());    
    }
}
