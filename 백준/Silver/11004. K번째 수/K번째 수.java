import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		List<Integer> al = new ArrayList<>(); 
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			al.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(al);
		
		System.out.println(al.get(k-1));
	}

}
