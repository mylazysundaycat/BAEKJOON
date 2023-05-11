import java.util.Scanner;

public class code_14681_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		do {
			x = sc.nextInt();
			y = sc.nextInt();
		} while((x<-1000||x>1000)||(y<-1000||y>1000));

		System.out.println(x>0?(y>0?"1":"4"):(y>0?"2":"3"));
	}
}
