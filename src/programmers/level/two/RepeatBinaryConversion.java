package programmers.level.one;

public class RepeatBinaryConversion {

    public static void main(String[] args) {
        String s = "110010101001";
        int[] answer = new int[2];
        int count = 0;
        while(s.length() > 1) {
            
            int delZero = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') {
                    answer[1]++;
                } else {
                    delZero++;
                }
            }
            s = Integer.toBinaryString(delZero);
            answer[0]++;
        }
        
        System.out.println(answer);
    }
}
