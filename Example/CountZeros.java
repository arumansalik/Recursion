package Example;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(103050 ));
        System.out.println(count1(10030050 ));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int i) {
        if(n == 0) {
            return i;
        }

        int rem = n % 10;
        if(rem == 0) {
            return helper(n/10, i+1);
        }

        return helper(n/10, i);
    }
    static int count1(int n) {
        return helper1(n, 0);
    }

    private static int helper1(int n, int c) {
        if(n == 0) {
            return c;
        }
        int rem = n % 10;
        if(rem == 0) {
            return helper1(n / 10, c + 1);
        }
        return helper1(n / 10, c);
    }
}
