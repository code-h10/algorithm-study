package programmers.level.one;

public class CreateJadenCaseStrings {

    public static String toJadenCase(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        
        StringBuilder answer = new StringBuilder();
        char[] ch = s.toCharArray();
        
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            answer.append(Character.toUpperCase(ch[0]));
        } else {
            answer.append(ch[0]);
        }
        
        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] == ' ') {
                answer.append(Character.toUpperCase(ch[i]));
            } else {
                answer.append(Character.toLowerCase(ch[i]));
            }
        }
        return answer.toString();
    }
  
    public static void main(String[] args) {
        String answer = toJadenCase(s);
        System.out.println(answer);
    }
}
