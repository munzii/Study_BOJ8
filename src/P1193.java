import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1193 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		int c = 1;
		int sum =0;
		
		while(true) {
			if(x<= sum+c) {
				if(c%2==1) {
					bw.write(String.valueOf((c-(x-sum-1))+ "/" + (x-sum)));
					break;
				}
				
				else {
					bw.write((String.valueOf((x-sum))+"/"+(c-(x-sum-1))));
					break;
				}
			}
			
			else {
				sum+=c;
				c++;
			}
		}
		
		br.close();
		bw.flush();
		bw.close();

	}

}