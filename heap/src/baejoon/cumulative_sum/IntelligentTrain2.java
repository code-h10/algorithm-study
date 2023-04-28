package baejoon.cumulative_sum;

public class IntelligentTrain2 {
    public static void main(String[] args) {

        int[][] input = {{0, 32}, {3, 13}, {28, 25}, {17, 5}, {21, 20}, {11, 0}, {12, 12}, {4, 2}, {0, 8}, {21, 0}};

        int maximum = 0;
        int current = 0;

        for(int i = 0; i < 10; i++) {
            
            int in = input[i][1];
            int out = input[i][0];

            if(i == 0) {
                current = in;
            } else {
                current = (current - out) + in;
            }

            if(maximum <= current) {
                maximum = current;
            }
        }
        System.out.println(maximum);
    }
}
