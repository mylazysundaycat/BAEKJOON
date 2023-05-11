import java.io.IOException;
import java.util.Scanner;

public class code_10807_2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] arr = new int[a];
		
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		
		int findNum = sc.nextInt();
		
		int sum = 0;
		
		for(int i=0; i<a; i++) {
			if(arr[i]==findNum) sum++;
		}
		
		System.out.println(sum);
				
	}
}
