import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AplusB_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int a = 0;
		int b = 0;
			
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write("Case #" + i + ": ");
			bw.write(a + " + " + b + " = " );
			bw.write(a+b + "\n");
		}
		br.close();
		bw.flush();
		bw.close();		
	}
}