package programmers.level.zero;

import java.math.BigInteger;

public class Problem3 {
    public static void main(String[] args) {

        int balls = 30;
        int share = 14;

        BigInteger numerator = BigInteger.ONE;
        BigInteger denominator = BigInteger.ONE;

        for (int i = balls; i > balls - share; i--) {
            numerator = numerator.multiply(BigInteger.valueOf(i));
        }

        for (int j = share; j > 0; j--) {
            denominator = denominator.multiply(BigInteger.valueOf(j));
        }

        BigInteger result = numerator.divide(denominator);

        System.out.println(result.intValue());
    }
}