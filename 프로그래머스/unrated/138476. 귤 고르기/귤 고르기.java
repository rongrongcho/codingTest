import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 각 크기별로 개수를 저장하는 맵을 생성
        Map<Integer, Integer> tanMap = new HashMap<>();
    for (int i = 0; i < tangerine.length; i++) {
        // tangerine[i]의 값 즉 i번째 방에 들어있는 귤의 size를 변수에 담아줌(비교위해)
        int size = tangerine[i];
        // tangerine[i]의 귤 크기(size)가 map에 저장되어있는지 확인 ㄱㄱ 
        // tanMap에 size가 포함되어있니?하고 물어봄
        if (tanMap.containsKey(size)) {
            // 이미 저장되어있는 size의 경우 value값을 가져온다. (기존값)
            int currentCount = tanMap.get(size);
            // 이미 저장되어있는 거고 i번째도 같은 사이즈니깐 기존값에 +1 (갱신값)
            tanMap.put(size, currentCount + 1);
        } else {
            // 저장되어 있지 않다면 새로운 size를 추가하고 밸류 1개로 저장해놓음 
            tanMap.put(size, 1);
        }
    }
        // 개수가 가장 많은 귤부터 내림차순으로 정렬
        Integer[] sizes = tanMap.keySet().toArray(new Integer[0]);
        Arrays.sort(sizes, (a, b) -> tanMap.get(b) - tanMap.get(a));
        int varieties = 0; // 상자에 담기는 귤의 종류 수를 저장하는 변수
        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i]; // sizes 배열에서 현재 귤의 크기를 가져옴
            if (k <= 0) {
                break; // 상자에 담을 수 있는 귤이 더 이상 없으면 종료
            }
            int count = tanMap.get(size);// 현재 크기의 귤 개수를 가져옴
            int selected = Math.min(k, count); // 상자에 담을 개수를 선택 (상자에 남은 공                                   간보다 현재 크기의 귤이 많으면 상자에 남은 공간만큼만 담음)
            varieties++; 
            // 새로운 종류의 귤을 선택함 (상자에 담은 귤의 크기가 다르면 종류가 증가)
            k -= selected; 
            // 상자에 담은 개수만큼 k를 감소시킴 (상자에 담은 귤 개수만큼 공간이 차니까)
        }
        return varieties;
    }
}
