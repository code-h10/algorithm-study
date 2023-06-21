package programmers.level.one;
import java.util.*;

public class PressTheKeyPad {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        String answer = "";
        int rNumber = -2;
        int lNumber = -1;
        
        Map<Integer, int[]> keypadPos = new HashMap<>();
        int n = 1;
        keypadPos.put(0, new int[]{3,1});
        keypadPos.put(-1, new int[]{3,0});
        keypadPos.put(-2, new int[]{3,2});
        for(int y = 0; y < 3; y++) {
            for(int x = 0; x < 3; x++) {
                keypadPos.put(n, new int[]{y,x});
                n++;
            }
        }
    
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                lNumber = numbers[i];
                sb.append("L");
            } else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                rNumber = numbers[i];
                sb.append("R");
            } else if(numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) {
                int[] numbersPos = keypadPos.get(numbers[i]);
                int[] lPos = keypadPos.get(lNumber);
                int[] rPos = keypadPos.get(rNumber);
                
                int rX = Math.abs(numbersPos[0] - rPos[0]);
                int rY = Math.abs(numbersPos[1] - rPos[1]);
                int lX = Math.abs(numbersPos[0] - lPos[0]);
                int lY = Math.abs(numbersPos[1] - lPos[1]);
                
                int r = rX + rY;
                int l = lX + lY;
                
                if(r > l) {
                    lNumber = numbers[i];
                    sb.append("L");
                } else if(l > r) {
                    rNumber = numbers[i];
                    sb.append("R");    
                } else if(r == l) {
                    if(hand.equals("right")) {
                        rNumber = numbers[i];
                        sb.append("R");       
                    } else {
                        lNumber = numbers[i];
                        sb.append("L");                            
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
    }
}
