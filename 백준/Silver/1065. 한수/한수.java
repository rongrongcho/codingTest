

import java.util.Scanner;

public class Main {
	//등차수열
	// [1,1,1,1,1] [1,3,5,7,9]	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(hansoo(sc.nextInt()));
	}
	
	public static int hansoo(int num) {
		int count = 0; // 한수 카운팅
 
		if (num < 100) {
			return num;
		}
 
		else {
			count = 99;
 
			for (int i = 100; i <= num; i++) {
				int hun = i / 100; 
				int ten = (i / 10) % 10; 
				int one = i % 10;
 
				if ((hun - ten) == (ten - one)) { 
					count++;
				}
			}
		}
		return count;
	}

}
