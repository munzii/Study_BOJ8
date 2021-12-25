import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2292 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		int m = 2;
		
		if(n==1) {
			bw.write(String.valueOf("1"));
		}
		
		else {
			while(m<=n) {
				m = m + (6*count);
				count++;
			}
			bw.write(String.valueOf(count));
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}