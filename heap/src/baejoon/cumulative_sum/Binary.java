package baejoon.cumulative_sum;

public class Binary {
    public static void main(String[] args) {

        int n = Integer.parseInt("1");

        for(int i = 0; i < n; i++) {
            char[] input = Integer.toBinaryString(Integer.parseInt("13")).toCharArray();
            System.out.println(input);
            int k = 0;
            for (int j = input.length-1; j >= 0; j--) {
                if (input[j] == '1') {
                    System.out.print(k + " ");
                    k++;
                } else {
                    k++;
                }
            }
        }
    }
}
