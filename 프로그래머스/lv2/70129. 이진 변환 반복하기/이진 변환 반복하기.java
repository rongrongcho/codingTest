class Solution {
    public int[] solution(String s) {
        int one=0; 
        int zero=0; 
        int count=0; 
        int[] answer = new int[2];
        while(!s.equals("1")){
            count++;
            for(int i=0; i<s.length();i++){
                if(s.charAt(i)=='1'){
                    one++;
                }else if(s.charAt(i)=='0'){
                    zero++;
                }
            }
            s=Integer.toBinaryString(one);
            one=0; 
        }
        answer[0]=count; 
        answer[1]=zero; 
        return answer;
    }
}