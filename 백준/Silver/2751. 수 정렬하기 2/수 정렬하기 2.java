import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int nn = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < nn; i++) {
			list.add(in.nextInt());
		}
		Collections.sort(list);
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}