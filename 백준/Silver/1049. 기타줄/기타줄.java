import java.util.*;
import java.io.*;

public class Main {
    static HashSet<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int six = Integer.MAX_VALUE;
            int one = Integer.MAX_VALUE;

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int price1 = Integer.parseInt(st.nextToken());
                int price2 = Integer.parseInt(st.nextToken());
                if (price1 < six)
                    six = price1;
                if (price2 < one)
                    one = price2;
            }
            int price = 0;
            while (n >= 6) {
                int min = Math.min(six, one * 6);
                price += min;
                n -= 6;
            }

            if (n > 0) {
                int min = Math.min(six, one * n);
                price += min;
            }
            System.out.println(price);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
