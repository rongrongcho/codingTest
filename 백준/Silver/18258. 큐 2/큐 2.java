import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	
		Deque<Integer> q = new LinkedList<>();	
		int N = Integer.parseInt(br.readLine());	
		StringTokenizer st;
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {	
			
			case "push":
				q.offer(Integer.parseInt(st.nextToken()));	
				break;
			
			case "pop" :
				Integer itm = q.poll();	
				if(itm == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(itm).append('\n');
				}
				break;
				
			case "size":	
				sb.append(q.size()).append('\n');
				break;
				
			case "empty":
				if(q.isEmpty()) {
					sb.append(1).append('\n');
				}
				else {
					sb.append(0).append('\n');
				}
				break;
				
			case "front":
				Integer frnt = q.peek();
				if(frnt == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(frnt).append('\n');
				}
				break;
				
			case "back":
				Integer bck = q.peekLast();	 
				if(bck == null) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(bck).append('\n');
				}
				break;
			}
		}
		System.out.println(sb);
	}
}
