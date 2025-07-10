package Example;//Example.ReverseANumber using the recursion

public class ReverseANumber {

    static int sum = 0;
    static void reverse1(int n) {
        if( n == 0 ) {
            return;
        }
        int rem = n % 10;

        sum = sum * 10 + rem;
        reverse1(n/10);
    }

    static int reverse2(int n) {
         int digits = (int)(Math.log10(n)) + 1;
         return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        int ans = reverse(1234);
        System.out.println(ans);

        reverse1(1234);
        System.out.println(sum);


        System.out.println(reverse2(1234));

    }

    static int reverse(int n) {
        int rev = 0;
        while(n != 0) {


            int last = n % 10;

            n = n / 10;

            rev = (rev * 10) + last;
        }
        return rev;
    }


}
