package programmers.level.one;

public class SplitString {
    public static void main(String[] args) {
        String answer = "";
        
	      // 각 월의 마지막값
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        

	      // 입력받은 월까지의 일수 구하기
        int totalDays = 0;
        for (int i = 0; i < a-1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += b;

	      // 시작 요일 설정
        int startingDay = 5; 
	      // 시작요일 index와 전체일수를더하여 7로 나눈 값구하기 
        int dayOfWeek = (startingDay + totalDays - 1) % 7;

        String[] weekdays = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        answer = weekdays[dayOfWeek];
    
        system.out.println(answer);
    }
}
