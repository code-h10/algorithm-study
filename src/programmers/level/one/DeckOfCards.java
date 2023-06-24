package programmers.level.one;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        
        String answer = "Yes";
        ArrayDeque<String> cardsQ1 = new ArrayDeque<>();
        ArrayDeque<String> cardsQ2 = new ArrayDeque<>();
        int count = 0;
        
        for(String card : cards1) {
            cardsQ1.add(card);
        }
        
        for(String card : cards2) {
            cardsQ2.add(card);
        }
        
        for(String g : goal) {
        
            String q1 = cardsQ1.peekFirst();
            String q2 = cardsQ2.peekFirst();
            
            if(!cardsQ1.isEmpty() && q1.equals(g)) {
                cardsQ1.pollFirst();
                count++;
            }
            if(!cardsQ2.isEmpty() && q2.equals(g)) {
                cardsQ2.pollFirst();
                count++;
            }            
        }
        
        
        if(cardsQ1.size() != 0 || cardsQ2.size() != 0) {
            if(count == goal.length) {
                answer = "Yes";
            } else {
                answer = "No";   
            }
        }
        
        System.out.println(answer);
    }
}
