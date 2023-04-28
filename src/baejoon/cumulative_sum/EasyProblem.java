package baejoon.cumulative_sum;

public class EasyProblem {
    public static void main(String[] args) {

        int a = 3;
        int b = 7;
        int[] sequence = new int[1001];
        int count = 1;
        int num = 1;
        int sum = 0;

        for(int i = 0; i < sequence.length; i++) {
            sequence[i] = num;
            if(count == num) {
                count = 1;
                num++;
            } else {
                count++;
            }
        }
        for(int j = a-1; j <= b-1; j++) {
            sum += sequence[j];
        }
        System.out.println(sum);
    }
}
