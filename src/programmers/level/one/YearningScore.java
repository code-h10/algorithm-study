package programmers.level.one;

import java.util.*;

public class YearningScore {
    public static void main(String[] args) {

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5,10,1,3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] answer = new int[photo.length];
        Map<String, Integer> storage = new HashMap<>();
        
        for(int i = 0; i < name.length; i++) {
            storage.put(name[i], yearning[i]);
        }
        
        int sum = 0;
        for(int j = 0; j < photo.length; j++) {
            sum = 0;
            for(int k = 0; k < photo[j].length; k++) {
                if(storage.containsKey(photo[j][k])) {
                    sum += storage.get(photo[j][k]);    
                }
            }
            answer[j] = sum;
        }
        System.out.println(answer);
    }
}
