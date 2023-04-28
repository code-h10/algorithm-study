package baejoon.cumulative_sum;

import java.util.ArrayList;
import java.util.List;

public class Measure {
    public static void main(String[] args) {

        int n = Integer.parseInt("25");
        int k = Integer.parseInt("4");
        List<Integer> measure = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                measure.add(i);
            }
        }

        System.out.println(measure.size() >= k ? measure.get(k-1) : 0);
    }
}
