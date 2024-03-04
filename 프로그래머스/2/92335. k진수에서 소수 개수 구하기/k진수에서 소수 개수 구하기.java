import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0; 
        String str = "";
        while (n != 0) {
            str = n % k + str; 
            n /= k;
        }
        String[] arr = str.split("0");
        for (String s : arr) {
            if (s.equals("")) continue;
            long num = Long.parseLong(s);
            if (isPrime(num)) {
                answer++;
            }
        }
        return answer; 
    }
    
    public boolean isPrime(long num) {
        if (num < 2) return false; 
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true; 
    }
}
