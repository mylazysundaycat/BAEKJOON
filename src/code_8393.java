import java.util.Scanner;

public class code_8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		do {
			n= sc.nextInt();
		} while(n<1 || n>10000);
		
		System.out.println(n*(n+1)/2);
	}
}
