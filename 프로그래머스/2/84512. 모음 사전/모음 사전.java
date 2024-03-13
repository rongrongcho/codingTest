import java.util.*;
class Solution {
    final char[] DICTIONARY = {'A','E','I','O','U'};
    public int solution(String word) {
        int answer=0; 
        List<String> elements = new ArrayList<>();
        for(int i=0; i<5; i++){
            dfs(elements, String.valueOf(DICTIONARY[i]));
        }
        for(int i=0; i<elements.size(); i++){
            if(elements.get(i).equals(word)){
                answer=i+1; 
                break;
            }
        }
        return answer;
    
    }
    
    void dfs(List<String> elements, String str){
        if(str.length()>5) return; 
        if(!elements.contains(str))elements.add(str);
        for(int i=0; i<5; i++){
            dfs(elements,str+DICTIONARY[i]);
        }
    }
}