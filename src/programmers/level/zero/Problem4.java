package programmers.level.zero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem4 {

    public static class Pair implements Comparable<Pair> {

        private int key;
        private int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public int getKey() {
            return key;
        }

        @Override
        public int compareTo(Pair o) {
            if(o.getKey() == this.getKey()) {
                return  o.getValue() - this.getValue();
            }
            return this.getKey() - o.getKey();
        }
    }

    public static void main(String[] args) {

//        int[] numlist = {1, 2, 3, 4, 5, 6};
//        int n = 4;

        int[] numlist = {10000,20,36,47,40,6,10,7000};
        int n = 30;

        List<Pair> distance = new ArrayList<>();

        for (int num : numlist) {
            distance.add(new Pair(Math.abs(num-n),num));
        }

        Collections.sort(distance);

        for (Pair d : distance) {
            System.out.println(d.getKey() + " " + d.getValue());
        }
    }
}
