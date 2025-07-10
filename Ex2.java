public class Ex2 {
    public static void main(String[] args) {
        System.out.println(plaindrome(0, "madam"));

    }

    static boolean plaindrome(int i, String s) {
        if(i>=s.length()/2) return true;

        if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
            return false;
        }
        return plaindrome(i+1, s);
    }
}
