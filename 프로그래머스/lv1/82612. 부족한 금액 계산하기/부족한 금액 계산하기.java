class Solution {
    public long solution(int price, int money, int count) {
        long tot=0;
        for(int i=1; i<=count; i++){
            tot+=i*price;
        }
        if(tot-money<0){
            return 0;
        }
        return tot-money;
    }
}
