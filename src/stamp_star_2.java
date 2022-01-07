import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class stamp_star_2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
			
		for (int i = 1; i <= a; i++) {
			for(int j = 1; j <= a-i; j++) {
			bw.write(" ");
			}
			for (int k = 1; k <= i; k++) {
			bw.write("*");
			}
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}