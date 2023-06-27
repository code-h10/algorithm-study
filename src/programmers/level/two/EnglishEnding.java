package programmers.level.one;

public class EnglishEnding {

    public static void main(String[] args) {
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int[] answer = new int[2];
        
        Deque<String> deque = new ArrayDeque<>();
        deque.add(words[0]);
        for(int i = 1; i < words.length; i++) {
            
            String word = deque.peekLast();
            
            if(deque.contains(words[i])) {
                answer[0] = ((i+1) % n) == 0 ? n : ((i+1) % n);
                answer[1] = (int)Math.round((double)(i + 1) / n);
                break;
            } else if(word.charAt(word.length()-1) != words[i].charAt(0)) {
                answer[0] = ((i+1) % n) == 0 ? n : ((i+1) % n);
                answer[1] = (int)Math.round((double)(i + 1) / n);
                break;
            } else {
                deque.add(words[i]);
            } 
        }
        System.out.println(answer);
    }
}
