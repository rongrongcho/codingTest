import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
		int leng = elements.length;
		for (int size = 1; size <= leng; size++) {
			for (int i = 0; i < leng; i++) {
				int sum = 0;
				for (int j = i; j < i + size; j++) {
					sum += elements[j % leng];
				}
				set.add(sum);
			}
		}
		return set.size();
    }
}