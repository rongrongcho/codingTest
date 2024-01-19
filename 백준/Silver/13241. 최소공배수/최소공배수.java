import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        
        long gcd = findGCD(Math.max(num1, num2), Math.min(num1, num2));
        
        System.out.println((num1*num2)/gcd);
    }
    
    public static long findGCD(long a, long b) {
        while(b > 0) {
            long temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }
}
