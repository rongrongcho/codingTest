import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        boolean[] check = new boolean[N + 1];

        int cnt = 0;
        int answer = 0;

        for (int i = 2; i <= N; i++) {
            if (!check[i]) {
                for (int j = i; j <= N; j += i) {
                    if (!check[j]) {
                        check[j] = true;
                        cnt++;
                        if (cnt == K) {
                            answer = j;
                            break;
                        }
                    }
                }
            }
            if (cnt == K) {
                break;
            }
        }

        System.out.println(answer);
    }
}
