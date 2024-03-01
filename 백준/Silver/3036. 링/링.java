

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int first = sc.nextInt();
        for (int i = 1; i < N; i++) {
            int second = sc.nextInt();
            int gcd = getGCD(first, second);
            System.out.println((first / gcd) + "/" + (second / gcd));
        }
    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2); 
    }

}
