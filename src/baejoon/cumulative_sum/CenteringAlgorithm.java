package baejoon.cumulative_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CenteringAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        int firstOperand = 1;
        int secondOperand = 2;
        for(int i = 1; i <= n; i++) {
            if(i == 1) {
                result = firstOperand + secondOperand;
                firstOperand = firstOperand + 1;
            } else {
                secondOperand = result;
                result = firstOperand + secondOperand;
                firstOperand = firstOperand * 2;
            }
        }
        System.out.println(result * result);
    }
}
