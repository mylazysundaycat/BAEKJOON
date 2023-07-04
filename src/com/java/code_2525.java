package com.java;

import java.util.Scanner;

public class code_2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = 0;
		int m = 0;
		int c = 0;
		
		do {
			h = sc.nextInt();
			m = sc.nextInt();
			c = sc.nextInt();
		} while((h<0||h>23)||(m<0||m>59)||(c<0||c>1000));
		
		h = h+(c/60);
		m = m+(c%60);	
		
		if(m>=60) {
			m -= 60;
			h += 1;
		}
		
		if(h>23) {
			h -= 24;
		}
		
		System.out.println(h+" "+m);

	}
}
