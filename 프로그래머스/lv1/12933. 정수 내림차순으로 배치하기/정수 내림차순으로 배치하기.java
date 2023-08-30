import java.util.*;

class Solution {
    public long solution(long n) {
        String[] numbers = String.valueOf(n).split("");
        Arrays.sort(numbers);
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            String nList = numbers[i];
            stb.append(nList);
        }
        return Long.parseLong(stb.reverse().toString());
    }
}
