import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0, start = 0, end = 0, sum = 0;
		while(start < n) {
			if( end == n|| sum > m )
                sum-=arr[start++];
			else sum+=arr[end++];
                
			if(sum==m) cnt++;
		}
		
		System.out.println(cnt);
	
	
	}
}