import java.util.*;

class Main {  
  public static void main(String args[]) { 
	  Scanner sc = new Scanner(System.in);
	  int number = sc.nextInt();
	  
	  int cnt = 1; 
	  int temp = 0; 
	  int leng = 10; 

	  for(int i = 1; i <= number; i++){
		  if(i == leng){
			  cnt++;
			  leng = leng * 10;
		  }
		  temp += cnt; 
	  }
	  System.out.println(temp);
  } 
}