package com.java;

import java.util.Scanner;

public class code_9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		
		if(result>=90&&result<=100) {
			System.out.println("A");
		}else if(result>=80&&result<=89) {
			System.out.println("B");
		}else if(result>=70&&result<=79) {
			System.out.println("C");
		}else if(result>=60&&result<=69) {
			System.out.println("D");
		}else if(result>=0&&result<60) {
			System.out.println("F");
		}
	}
}
