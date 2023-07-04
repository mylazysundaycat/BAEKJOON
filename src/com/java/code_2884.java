package com.java;

import java.util.Scanner;

public class code_2884 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int hour = 0;
		int minute = 0;
		do {
			hour = sc.nextInt();
			minute = sc.nextInt();
		} while((hour<0||hour>23)||(minute<0||minute>59));
			
		minute = minute-45;
		
		if(minute<0) {
			minute = 60 + minute;
			hour -= 1;
			if(hour<0) {
				hour = 24 + hour;
			}
		}
		
		System.out.printf("%d %d",hour,minute);
	}
}
