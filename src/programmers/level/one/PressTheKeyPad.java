package programmers.level.one;
import java.util.*;

public class PressTheKeyPad {
    public static void main(String[] args) {
        StringBuilder answer = new StringBuilder();
        int leftNumber = -1;
        int rightNumber = -2;

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

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                leftNumber = numbers[i];
                answer.append("L");
            } else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                rightNumber = numbers[i];
                answer.append("R");
            } else if(numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) {
                int[] numbersPos = keypadPos.get(numbers[i]);
                int[] leftPos = keypadPos.get(leftNumber);
                int[] rightPos = keypadPos.get(rightNumber);

                int rightX = Math.abs(numbersPos[0] - rightPos[0]);
                int rightY = Math.abs(numbersPos[1] - rightPos[1]);
                int leftX = Math.abs(numbersPos[0] - leftPos[0]);
                int leftY = Math.abs(numbersPos[1] - leftPos[1]);

                int right = rightX + rightY;
                int left = leftX + leftY;

                if(right > left) {
                    leftNumber = numbers[i];
                    answer.append("L");
                } else if(left > right) {
                    rightNumber = numbers[i];
                    answer.append("R");    
                } else if(right == left) {
                    if(hand.equals("right")) {
                        rightNumber = numbers[i];
                        answer.append("R");       
                    } else {
                        leftNumber = numbers[i];
                        answer.append("L");                            
                    }
                }
            }
        }
        return answer.toString();
    }
}
