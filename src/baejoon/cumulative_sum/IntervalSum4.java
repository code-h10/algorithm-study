package baejoon.cumulative_sum;

public class IntervalSum4 {
    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        int[] numbers = {5,4,3,2,1};
        int[][] interval = {{1,3},{2,4},{5,5}};
        int[] prefixSum = new int[n+1];
        prefixSum[0] = 0;

        // prefix sum 계산
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = (prefixSum[i-1] + numbers[i-1]);
        }


        // 각 구간의 합 계산
        for (int i = 0; i < m; i++) {
            int start = interval[i][0]-1;
            int end = interval[i][1];
            System.out.println(start + " " + end);
            int intervalSum = prefixSum[end] - prefixSum[start];
            System.out.println(intervalSum);
        }
    }
}
