package Strings;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subSeqAscii("", "abc");
//        System.out.println(subSeqArr("", "abc"));
    }

    static void subSeq(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1));
        subSeq(p , up.substring(1));
    }

    static ArrayList<String> subSeqArr(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeqArr(p + ch, up.substring(1));
        ArrayList<String> rigth = subSeqArr(p , up.substring(1));

        left.addAll(rigth);
        return left;
    }

    static void subSeqAscii(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSeqAscii(p + ch, up.substring(1));
        subSeqAscii(p , up.substring(1));
        subSeqAscii(p + (ch + 0), up.substring(1));
    }
}
