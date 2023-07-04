package com.java;

import java.util.Scanner;

public class code_1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);

		
		System.out.println(a>b?">":(a==b?"==":"<"));
	}
}
