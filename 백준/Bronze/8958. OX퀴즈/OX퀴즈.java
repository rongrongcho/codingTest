import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str;
        for(int i =0; i< n; i++){
            str = sc.next();
            int count =0;
            int result = 0;
            for(int j =0; j< str.length(); j++){
                if(str.charAt(j) =='O'){
                    count++;
                    result = result + count;
                }
                else count =0;
            }
            System.out.println(result);

        }

    }
}