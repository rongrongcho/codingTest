import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		int kim=sc.nextInt();
		int lim=sc.nextInt();
		int cnt=0;
		int[] arr= new int[N];
		while(kim != lim) {
			kim=kim/2 + kim%2;
			lim=lim/2 + lim%2; 
			cnt++;
		}
		System.out.println(cnt);
		
	}

}
