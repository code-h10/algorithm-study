package baejoon.cumulative_sum;

import java.util.Arrays;

public class NthLargestNumber {
    public static void main(String[] args) {

        int n = 4;
        int[][] a = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 1000}, {338, 304, 619, 95, 343, 496, 489, 116, 98, 127}, {931, 240, 986, 894, 826, 640, 965, 833, 136, 138}, {940, 955, 364, 188, 133, 254, 501, 122, 768, 408}};
        
        for(int k = 0; k < n; k++) {
            Arrays.sort(a[k]);
            System.out.println(a[k][7]);
        }
    }
}