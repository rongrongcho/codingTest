import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
 
		int crossC = 1, prevC = 0;
 
		while (true) {
        
			if (x <= prevC + crossC) {	
				
				if (crossC % 2 == 1) {

					System.out.print((crossC - (x - prevC - 1)) + "/" + (x - prevC));
					break;
				} 
				
				else {
					
					System.out.print((x - prevC) + "/" + (crossC - (x - prevC - 1)));
					break;
				}
 
			} else {
				prevC += crossC;
				crossC++;
			}
		}
	}
}