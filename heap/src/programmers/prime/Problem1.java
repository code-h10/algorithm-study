package programmers.prime;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        // sieve of eratosthenes algorithm
        int n = 30;
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);

        for (int i = 2; i * i <= n ; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n ; j+=i) {
                    prime[j] = false;
                }
            }
        }

        for (int k = 2; k <= n; k++) {
            if (prime[k]) {
                System.out.print(k + " ");
            }
        }
    }
}
