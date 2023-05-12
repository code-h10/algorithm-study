package baejoon.cumulative_sum;

public class Bridge {
    private static int[][] dp = new int[30][30];

    public static int binomialCoefficient(int n, int k) {

        if(dp[n][k] > 0) {
            return dp[n][k];
        }

        if(n == k || k == 0) {
            return dp[n][k] = 1;
        }

        return dp[n][k] = binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k);
    }

    public static void main(String[] args) {

        int n = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String[] nk = {"13", "29"};
            int result = binomialCoefficient(Integer.parseInt(nk[0]), Integer.parseInt(nk[1]));
            sb.append(result).append("\n");
        }
        System.out.println(sb);

    }
}
