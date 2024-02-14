class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 변수 작명 ar1의 row , ar1의 column , ar2의 column
        int ar1 = arr1.length; 
		int ac1 = arr1[0].length; 
		int ac2 = arr2[0].length; 
		int[][] answer = new int[ar1][ac2];
		for(int i = 0; i < ar1; i++) {
			for(int j = 0; j < ac2; j++) {
				int sum = 0;
				for(int k = 0; k < ac1; k++) {
					sum += arr1[i][k] * arr2[k][j];
				}
				answer[i][j] = sum;
			}
		}
        
        return answer;
    }
}