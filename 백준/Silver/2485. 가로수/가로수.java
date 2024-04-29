import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int n = 0; n < N; n++)
            arr[n] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        int gcd = 0;
        for(int i=0; i<N-1; i++){
            int dis = arr[i+1]-arr[i];
            gcd = gcd(dis, gcd);
        }
        str.append((arr[N-1]-arr[0])/gcd + 1 - (arr.length));
        System.out.print(str);
        br.close();
    }
    public static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
}
