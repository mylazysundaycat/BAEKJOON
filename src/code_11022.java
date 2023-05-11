import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class code_11022 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=1; i<t+1; i++) {
			String[] arr = br.readLine().split(" ");
			bw.write("Case #"+i+": "+arr[0]+" + "+arr[1]+" = "
			+(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]))+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
