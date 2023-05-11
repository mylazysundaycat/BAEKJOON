import java.util.Scanner;

public class code_2563 {
	public static void main(String[] args) {
		
		int[][] paper = new int[100][100];
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					paper[k][j] +=1;
				}
			}
		}
		
		//ÇÕ Ãâ·Â
		int sum=0;
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(paper[i][j]!=0) {
					sum += 1;
				}
			}
		}
		
		System.out.println(sum);
	}
}
