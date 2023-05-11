import java.util.Scanner;

public class code_2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputSize = sc.nextLine();
		String[] sizeArr = inputSize.split(" ",2);
		
		int n = Integer.valueOf(sizeArr[0]);
		int m = Integer.valueOf(sizeArr[1]);
		
		String[] inputArr1 = new String[n];
		for(int i=0; i<n; i++) {
			inputArr1[i] = sc.nextLine();
		}
		
		int[][] arr2D_1 = new int[n][m];
		
		//2차원 배열
		for(int i=0; i<n; i++) {
			String temp[] = inputArr1[i].split(" ");
			for(int j=0; j<m; j++) {
				arr2D_1[i][j] = Integer.valueOf(temp[j]);
			}
		}
		
		
		String[] inputArr2 = new String[n];
		for(int i=0; i<n; i++) {
			inputArr2[i] = sc.nextLine();
		}
		
		int[][] arr2D_2 = new int[n][m];
		
		//2차원 배열
		for(int i=0; i<n; i++) {
			String temp[] = inputArr2[i].split(" ");
			for(int j=0; j<m; j++) {
				arr2D_2[i][j] = Integer.valueOf(temp[j]);
			}
		}
		
		
		int[][] arr2D_sum = new int[n][m];
		//덧셈과정
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr2D_sum[i][j] = arr2D_1[i][j]+arr2D_2[i][j];
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.printf("%-2d",arr2D_sum[i][j]);
			}
			System.out.println();
		}
		
		//근데이거.. 애초에 두개 행렬 받을때 합을 한번에 구할수도 있는듯..? 이거 코드 짜고 만들어보기
		
		
	}
}
