import java.util.*;
public class code_2588 {
	public static void main(String[] args) {
		//세 자릿수 숫자 입력받음
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//(1)*(2)의첫째자리
		int output1 = a*(b%10);
		//(1)*(2)의둘째자리
		int output2 = a*((b%100)/10);
		//(1)*(2)의셋째자리
		int output3 = a*(b/100);
		//(1)*(2)의 곱셈결과
		int output4 = a*b;
		
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);
		System.out.println(output4);
		
	}
}
