import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer x = new StringTokenizer(s, " ");
        System.out.println(x.countTokens());
    }
}
