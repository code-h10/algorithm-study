package programmers.level.zero;

public class Problem1 {
    public static void main(String[] args) {

        int[] sides = {11, 7};
        int answer = 0;
        int sum = sides[0] + sides[1];
        int max = Math.max(sides[0], sides[1]);

        answer = (sum - max) * 2 - 1;
        System.out.println(answer);
    }
}
