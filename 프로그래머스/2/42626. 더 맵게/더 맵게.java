import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int mixCnt = 0;
        for(int s : scoville)
            pq.offer(s);
        while(pq.peek() < K) {
            if(pq.size() == 1) return -1;
            int mixS = pq.poll() + (pq.poll() * 2);
            pq.offer(mixS);
            mixCnt++;
        }
        return mixCnt;
    }
}
