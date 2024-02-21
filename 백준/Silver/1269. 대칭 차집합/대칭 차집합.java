import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());  
        int b = Integer.parseInt(st.nextToken()); 
        HashSet<Integer> ele = new HashSet<Integer>(); 
        st = new StringTokenizer(br.readLine()); 
        for(int i = 0; i < a; i++) {
            ele.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine()); 
        for(int i = 0; i < b; i++) {
            ele.add(Integer.parseInt(st.nextToken()));
        }
        br.close();
        bw.write((ele.size() -b) + (ele.size() - a) + "");
        bw.flush();
        bw.close();
    }
}
