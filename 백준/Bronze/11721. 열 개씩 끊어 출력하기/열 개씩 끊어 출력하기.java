import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String p = sc.next();
		for (int i = 0; i < p.length(); ++i) {
			System.out.print(p.charAt(i));
			if (i % 10 == 9) {
				System.out.println();
			}
		}
	}
}