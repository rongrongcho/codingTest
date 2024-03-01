import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 스위치 개수 입력 받기
        int switchCount = sc.nextInt();
        int[] switches = new int[switchCount + 1]; // 스위치 번호는 1부터 시작하므로 인덱스 0은 사용하지 않음

        // 각 스위치의 초기 상태 입력 받기
        for (int i = 1; i <= switchCount; i++) {
            switches[i] = sc.nextInt();
        }

        int students = sc.nextInt();

        for (int i = 0; i < students; i++) {
            int gender = sc.nextInt();
            int num = sc.nextInt();

            // 남학생
            if (gender == 1) {
                for (int j = num; j <= switchCount; j += num) {
                    switches[j] ^= 1; 
                }
            }
            // 여학생
            else if (gender == 2) {
                int left = num - 1;
                int right = num + 1;

                while (left > 0 && right <= switchCount && switches[left] == switches[right]) {
                    left--;
                    right++;
                }

                // 구간 내의 스위치 상태 변경
                for (int k = left + 1; k < right; k++) {
                    switches[k] ^= 1; 
                }
            }
        }

        // 최종 스위치 상태 출력
        for (int i = 1; i <= switchCount; i++) {
            System.out.print(switches[i] + " ");
            if (i % 20 == 0) { // 한 줄에 20개씩 출력
                System.out.println();
            }
        }
		

	}

}
