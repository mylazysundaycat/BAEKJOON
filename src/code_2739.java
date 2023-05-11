import java.util.Scanner;

public class code_2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		do {
			n = sc.nextInt();
		}while(n<1||n>9);
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d",n,i,i*n);
			System.out.println();
		}
	}
}
