import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class code_11021 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=1; i<t+1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			while(st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			bw.write("Case #"+i+": "+sum+"\n");
			sum = 0;
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
