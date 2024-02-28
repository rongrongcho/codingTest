import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();

        // 첫 번째 문자열의 다중집합 생성
        for (int i = 0; i < str1.length() - 1; i++) {
            char a = str1.charAt(i);
            char b = str1.charAt(i + 1);
            if (Character.isLetter(a) && Character.isLetter(b)) {
                String str = Character.toString(a) + Character.toString(b);
                list1.add(str);
            }
        }

        // 두 번째 문자열의 다중집합 생성
        for (int i = 0; i < str2.length() - 1; i++) {
            char a = str2.charAt(i);
            char b = str2.charAt(i + 1);

            if (Character.isLetter(a) && Character.isLetter(b)) {
                list2.add(Character.toString(a) + Character.toString(b));
            }
        }

        // 다중집합 정렬
        Collections.sort(list1);
        Collections.sort(list2);

        // 교집합과 합집합 계산
        for (String s : list1) {
            if (list2.remove(s)) {
                intersection.add(s);
            }
            union.add(s);
        }
        // 남은 원소들을 합집합에 추가
        for (String s : list2) {
            union.add(s);
        }
        // 자카드 유사도 계산
        double jak = 0;
        if (union.size() == 0)
            jak = 1;
        else
            jak = (double) intersection.size() / (double) union.size();
        return (int) (jak * 65536);
    }
}
