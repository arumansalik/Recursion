package Example;

import java.util.*;

public class WordBreak {
    public static boolean wordBreak1(String s, List<String> wordDict) {
        return solve(s, new HashSet<>(wordDict));
    }

    private static boolean solve(String s, Set<String> dict) {
        if(s.length() == 0) return true;


        for(int i = 1; i <= s.length(); i++) {
            String prefix  = s.substring(0, i);

            if(dict.contains(prefix)) {
                if(solve(s.substring(i), dict)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> dict = Arrays.asList("apple", "pen");

        System.out.println(wordBreak1(s, dict));
    }
}
