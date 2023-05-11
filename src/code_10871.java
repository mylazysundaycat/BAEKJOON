import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class code_10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] nx = br.readLine().split(" ");
		
		String[] numArr = br.readLine().split(" ");
		
		for(int i=0; i<Integer.parseInt(nx[0]); i++) {
			if(Integer.parseInt(numArr[i])<Integer.parseInt(nx[1])) {
				bw.write(numArr[i]+" ");
			}
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}
