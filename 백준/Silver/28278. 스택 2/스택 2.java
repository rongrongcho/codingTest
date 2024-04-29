import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int top = -1;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int op = Integer.parseInt(st.nextToken());
            switch(op) {
                case 1:
                    int num = Integer.parseInt(st.nextToken());
                    stack[++top] = num; 
                    break;
                case 2:
                    if(top == -1)
                        sb.append(-1).append('\n');
                    else
                        sb.append(stack[top--]).append('\n'); 
                    break;
                case 3:
                    sb.append(top + 1).append('\n'); 
                    break;
                case 4:
                    sb.append(top == -1 ? 1 : 0).append('\n'); 
                    break;
                case 5:
                    sb.append(top == -1 ? -1 : stack[top]).append('\n'); 
            }
        }

        System.out.print(sb);
    }
}
