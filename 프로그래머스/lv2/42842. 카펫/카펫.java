import java.util.*;
public class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];    
        int total = brown + yellow; // 전 격 수      
        for (int ver = 1; ver <= total; ver++) {
            if (total % ver == 0) {
                int hor = total / ver;
                int bCount = 2 * (hor + ver - 2); // 갈 격 수 
                if (bCount == brown) {
                    answer[0] = hor;
                    answer[1] = ver;
                    break;
                }
            }
        }
        return answer;
    }


}
