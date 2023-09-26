import java.util.*;
public class Solution {
    public String solution(String s) {
        char[] words = s.toCharArray();
        Arrays.sort(words);  
        char[] reverse = new char[words.length];
        for (int i = 0; i < words.length; i++) {
            reverse[i] = words[words.length - 1 - i];
        }   
        return new String(reverse);
    }
}
