package programmers.level.one;

public class Fibonacci {

    private static int[] fib;
 
    public int fibonacciBottomUp(int n) {
        if(n <= 1) {
            return 1;
        }
        
        int[] dp = new int[n + 1];
        dp[1] = 1;
        
        for(int i = 2; i < dp.length; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567; 
        }
        return dp[n];
    }
    
    
    public int fibonacci(int n) {
        if(n <= 2) {
            return 1;
        }
        
        if(fib[n] != 0) {
            return fib[n];
        }
        
        fib[n] = (fibonacci(n-1) + fibonacci(n-2)) % 1234567;
        return fib[n];
    }
  
    public static void main(String[] args) {
        int n = 5;
        fib = new int[n+1];
        fib[1] = 1;
        
        int answer = fibonacci(n);
        System.out.println(answer);
    }
}
