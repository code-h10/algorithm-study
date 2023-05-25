package baejoon.cumulative_sum;

import java.io.IOException;
import java.util.*;

public class SortWords {
    public static void main(String[] args) throws IOException {

        TreeSet<String> s = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });




        s.add("but");
        s.add("i");
        s.add("wont");
        s.add("hesitate");
        s.add("no");
        s.add("more");
        s.add("no");
        s.add("more");
        s.add("it");
        s.add("cannot");
        s.add("wait");
        s.add("im");
        s.add("yours");

        for (String result : s) {
            System.out.println(result);
        }

        
        int[] a = {5,4,21,7,6,3,1};



    }
}


