import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
		for (int i = 0; i < num.length; ++i) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		System.out.println(num[1]);
	}
}