import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mSum = 0;
		int c = 0;
		for (int i = 0; i < 5; i++) {
			String[] str = br.readLine().split(" ");
			if (str[0] == "")
				break;
			int sum = 0;
			for (int j = 0; j < str.length; j++)
				sum += Integer.parseInt(str[j]);
			if (mSum < sum) {
				mSum = sum;
				c = i + 1;
			}
		}
		System.out.println(c + " " + mSum);
	}
}