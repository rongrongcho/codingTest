class Solution {
    public int solution(int n) {
        int countOne = countOnes(n); // n의 1의 갯수를 세는 함수 호출
        int nNumber = n + 1; // 다음 숫자부터 시작
        while (countOnes(nNumber) != countOne) {
            nNumber++; // 1의 갯수가 같을 때까지 다음 숫자로 이동
        }
        return nNumber;
    }

    // 10진수를 2진수로 변환
    // 1의 개수 카운트 
    public int countOnes(int nn) {
        int count = 0;
        while (nn > 0) {
            if (nn % 2 == 1) {
                count++;
            }
            nn /= 2;
        }
        return count;
    }
}
