import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queuePrior = 
        new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        for (int i : priorities) {
            queuePrior.offer(i);
        }

        while (!queuePrior.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (queuePrior.peek() == priorities[i]) {
                    queuePrior.poll();
                    answer++;

                    if (location == i) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}