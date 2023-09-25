class Solution {
    public int solution(int n) {
        //n을 연속한 자연수들로 표현하는 방법 몇가지인지 저장하는 변수 
        int answer = 0;
        for(int i=1; i<=n;i++){
            int sum=0; 
            for(int j=i;j<=n;j++){
                sum+=j;
                    if(sum==n){
                        answer++; 
                        break; 
                    }else if(sum>n){
                        break;    
                    }
            }
        }
        return answer;
    }
}