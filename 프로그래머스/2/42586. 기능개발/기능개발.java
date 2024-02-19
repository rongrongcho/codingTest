import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ansList = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            int remProg = 100 - progresses[i];
            int days = remProg / speeds[i];
            if (remProg % speeds[i] != 0) {
                days++;
            }
            q.offer(days);
        }
        
        while (!q.isEmpty()) {
            int cnt = 1;
            int firstDay = q.poll();
            
            while (!q.isEmpty() && q.peek() <= firstDay) {
                cnt++;
                q.poll();
            }

            ansList.add(cnt);
        }

        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }
        
        return ans;
    }
}
