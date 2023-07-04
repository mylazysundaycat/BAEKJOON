package com.java;

import java.util.Scanner;

public class code_10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int a = 0;
		int b = 0;
		
		for(int i=0; i<t; i++) {
			do {
				a = sc.nextInt();
				b = sc.nextInt();
			}while(a<=0 || b>=10);
			System.out.println(a+b);
		}
	}
}
