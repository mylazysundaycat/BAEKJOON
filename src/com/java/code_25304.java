package com.java;

import java.util.Scanner;

public class code_25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		int a = 0;
		int b = 0;
		int sum = 0;
		
		for(int i=0; i<n; i++) {
				a = sc.nextInt();
				b = sc.nextInt();
			sum += a*b;
		}
		
		if(x==sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
