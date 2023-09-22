class Solution {
    boolean solution(String s) {
        int leftCount = 0;
        int rightCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftCount++;
            } else if (s.charAt(i) == ')') {
                rightCount++;
                if (rightCount > leftCount) {
                    return false;
                }
            }
        }
        return leftCount == rightCount;
    }
}
