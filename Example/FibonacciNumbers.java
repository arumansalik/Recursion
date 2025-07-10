package Example;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int ans = fibo(5);
        System.out.println(ans);
    }

    static int fibo(int n) {

        if(n < 2) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}


//Fibonacci Number
// Fibo(N - 1) + Fibo(N - 2)