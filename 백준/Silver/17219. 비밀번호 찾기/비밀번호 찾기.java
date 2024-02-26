import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, String> map=new HashMap<>();
		StringBuilder sb=new StringBuilder();
		try {
			String[] nm=br.readLine().split(" ");
			int N=Integer.parseInt(nm[0]);
			int M=Integer.parseInt(nm[1]);
			for(int i=0; i<N;i++) {
				nm=br.readLine().split(" ");
				map.put(nm[0], nm[1]);
			}
			for(int i=0; i<M; i++) {
				 System.out.println(map.get(br.readLine()));
				
			}
			
		}catch(IOException e) {
			System.out.println();
		}

	}
}
