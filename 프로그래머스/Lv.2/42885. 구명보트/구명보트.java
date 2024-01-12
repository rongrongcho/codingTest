import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int boat = 0;
        int count= 0; 
        Arrays.sort(people); //오름차순 정렬 
        for(int i=people.length-1; i>=count; i--){
            if(people[i]+people[count]<=limit){
                count++;
                boat++;
            }else {
                boat++;
            }
            
        }
        
        
        return boat;
    }
}