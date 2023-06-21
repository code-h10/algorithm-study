package programmers.level.one;

public class NearestLetter {
    public static void main(String[] args) {
      String s = "banana";
      int[] answer = new int[s.length()];
        
      answer[0] = -1;
      for(int i = 1; i < s.length(); i++) {
        String previous = s.substring(0, i);
            
        int index = previous.lastIndexOf(String.valueOf(s.charAt(i)));
        if(index == -1) {
          answer[i] = index;
        } else {
          answer[i] = i - index;
        }
      }
      System.out.println(answer);
    }
}
