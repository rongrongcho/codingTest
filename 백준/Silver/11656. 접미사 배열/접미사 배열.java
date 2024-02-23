
import java.util.*;

public class Main {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] sa = str.split("");
		String[] sum = sa;
		for (int i = 0; i < sa.length; i++) {
			for (int j = i + 1; j < sa.length; j++) {
				sum[i] += sa[j];
			}
		}

		Arrays.sort(sum);
		for (int i = 0; i < sum.length; i++) {
			System.out.println(sum[i]);
		}
	}

}