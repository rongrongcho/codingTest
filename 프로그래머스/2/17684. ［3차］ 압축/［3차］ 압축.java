import java.util.*;

class Solution {
    public int[] solution(String msg) {
        ArrayList<Integer> answerList = new ArrayList<>();
        HashMap<String, Integer> dict = new HashMap<>();

        int index = 1;
        for (char alp = 'A'; alp <= 'Z'; alp++) {
            dict.put(String.valueOf(alp), index++);
        }

        String w = ""; 
        int idx1 = 0; 
        int idx2 = 1; 

        while (idx2 <= msg.length()) {
            String current = msg.substring(idx1, idx2);

            if (dict.containsKey(current)) {
                w = current;
                idx2++;
            } else {
                answerList.add(dict.get(w));
                dict.put(current, index++);
                idx1 = idx2 - 1;
                idx2 = idx1 + 1;
                w = "";
            }
        }
        if (!w.isEmpty()) {
            answerList.add(dict.get(w));
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
