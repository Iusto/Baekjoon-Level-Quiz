import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AplusB_4 {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int T = N;
		int count = 0;
		
		do {
			N = ((N%10) * 10) + ((N/10 + (N % 10)) % 10);
			count++;
		}
		while(T != N);
		
		System.out.print(count);
		
	}
}