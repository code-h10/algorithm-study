package programmers.level.one;

public class Problem1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        int answer = 45;
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        answer = answer - sum;
        System.out.println(answer);
    }
}
