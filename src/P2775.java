import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2775 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[][] p = new int[15][15];
		
		for(int i=0; i<15; i++) {
			p[i][1] = 1;
			p[0][i] = i;
		}
		
		for(int k=1; k<15; k++) {
			for(int n=1; n<15; n++) {
				p[k][n] = p[k][n-1]+p[k-1][n];
			}
		}
		
		for(int i=0; i<T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(p[k][n])+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}