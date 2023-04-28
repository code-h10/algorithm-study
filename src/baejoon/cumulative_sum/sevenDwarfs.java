package baejoon.cumulative_sum;

import java.util.Arrays;

public class sevenDwarfs {
    public static void main(String[] args) {
        int[] men = {20, 7, 23, 19, 10, 15, 25, 8, 13};
        int[] seven = new int[7];
        int sum = 0;

        Arrays.sort(men);

        int remainder = sum - 100;
        int d1 = 0;
        int d2 = 0;


        for (int i = 0; i < men.length; i++) {
            for (int j = 0; j < men.length; j++) {
                if (remainder == men[i] + men[j]) {
                    d1 = i;
                    d2 = j;
                    break;
                }
            }
        }

        for(int k = 0; k < men.length; k++) {
            if(k == d1 || k == d2) {
                continue;
            }
            System.out.println(men[k]);
        }
    }
}
