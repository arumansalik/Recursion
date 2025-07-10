package Strings;

public class Stream {
    public static void main(String[] args) {
        skip("", "baccad");
        System.out.println(skip1("baccad"));
        System.out.println(skipRaziya("arumanraziyasalik"));
    }

    static void skip(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }




    static String skip1(String up) {
        if(up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a') {
            return skip1(up.substring(1));
        } else {
            return ch + skip1(up.substring(1));
        }
    }



    static String skipRaziya(String up) {
        if(up.isEmpty()) {
            return "";
        }

        if(up.startsWith("raziya")) {
            return skipRaziya(up.substring(6));
        } else {
            return up.charAt(0) + skipRaziya(up.substring(1));
        }
    }
}