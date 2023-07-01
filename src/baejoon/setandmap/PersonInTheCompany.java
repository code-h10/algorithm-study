package baejoon.cumulative_sum;

import java.util.*;
import java.io.*;


public class PersonInTheCompany {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, String> passHistories = new TreeMap<>(Collections.reverseOrder());
        
        for(int i = 0; i < n; i++) {
            String[] pass = br.readLine().split(" ");
            if(passHistories.containsKey(pass[0]) && pass[1].equals("leave")) {
                passHistories.remove(pass[0]);
            } else {
                passHistories.put(pass[0], "enter");
            }
        }
        
        for(Map.Entry<String, String> entry : passHistories.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
