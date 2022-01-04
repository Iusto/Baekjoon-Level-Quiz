import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int sum = 0;
		br.close();
		
		for (int i = 1; i <= a; i++) sum+=i;
		System.out.println(sum);
	}

}