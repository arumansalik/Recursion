package Example;

import java.util.ArrayList;
import java.util.List;
public class PhonePad {
    public static void main(String[] args) {
        System.out.println(pad("", "12"));
    }
    static List<String> pad(String p, String up) {
        if(up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0'; //this will convert '2' into 2;
        for(int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(pad(p + ch, up.substring(1)));
        }
        return ans;
    }
}