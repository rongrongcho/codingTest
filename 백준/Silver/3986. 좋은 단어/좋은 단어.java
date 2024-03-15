import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            String w = br.readLine();
            if (isGood(w)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    static boolean isGood(String word) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
