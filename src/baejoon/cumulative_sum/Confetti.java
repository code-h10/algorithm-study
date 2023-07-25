package baejoon.cumulative_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Confetti {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] matrix = new int[101][101];

        for(int i = 0; i < n; i++) {
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);

            for(int s = 1; s <= 10; s++) {
                for(int j = 1; j <= 10; j++) {
                    matrix[x+s][y+j] = 1;
                }
            }

        }

        int result = 0;
        for(int k = 1; k < 101; k++) {
            for(int z = 1; z < 101; z++) {
                result += matrix[k][z];
            }
        }

        System.out.println(result);

    }
}
