import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        int m = n; 
        for (int i = m - 1; i >= 0; i--) { 
            if (coin[i] <= t) {
                cnt += (t / coin[i]);
                t = t % coin[i];
            }
        }
        System.out.println(cnt);
    }

}
