package baejoon.cumulative_sum;

import java.util.*;
import java.io.*;


public class PersonInTheCompany {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        Map<String, String> encyclopedia = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String poketMon = br.readLine();
            encyclopedia.put(String.valueOf(i+1), poketMon);
            encyclopedia.put(poketMon, String.valueOf(i+1));
        }
        
        for(int j = 0; j < m; j++){
            String findPoketMon = br.readLine();
            if(encyclopedia.containsKey(findPoketMon)) {
                System.out.println(encyclopedia.get(findPoketMon));
            }
        }
    }
}
