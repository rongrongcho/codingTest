import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String[] st = sc.next().split(",");
            int A = Integer.parseInt(st[0]);
            int B = Integer.parseInt(st[1]);
            System.out.println(A + B);
        }
    }
}