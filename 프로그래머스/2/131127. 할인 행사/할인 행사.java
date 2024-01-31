import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days = 10;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        } 
       
        for(int i = 0; i < discount.length - days + 1; i++){
            Map<String, Integer> disMap = new HashMap<>();
            
            for(int j = 0; j < days; j++){
                disMap.put(discount[i + j], disMap.getOrDefault(discount[i + j], 0) + 1);
            }
            
            Boolean isTrue = true;
            
            for(String key : map.keySet()){
                if(map.get(key) != disMap.get(key)){
                    isTrue = false;
                    break;
                }
            }
            
            answer += isTrue ? 1 : 0;
        }
        
        return answer;
    }
}