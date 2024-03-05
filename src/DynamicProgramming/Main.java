package DynamicProgramming;

public class Main {
    public static void main(String[] args) {
        System.out.println(fiboDP(10));
    }
    public static int fibonacci(int n) {
        System.out.print(" " + n);
        if(n <= 1) {
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static int fiboDP (int n) {
        return fiboDP(n,new int[n+1]);
    }
    public static int fiboDP(int i, int[] memo) {
        if(i==0 || i==1) return i;

        if(memo[i] == 0) {
            memo[i] = fiboDP(i-1,memo) + fiboDP(i-2,memo);
        }
        return memo[i];
    }
}
