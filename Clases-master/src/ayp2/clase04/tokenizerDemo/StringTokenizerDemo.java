package ayp2.clase04.tokenizerDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String unaLinea = in.readLine();
		StringTokenizer st = new StringTokenizer(unaLinea);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
