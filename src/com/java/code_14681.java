package com.java;

import java.util.Scanner;

public class code_14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		
		do {
			x = sc.nextInt();
			y = sc.nextInt();
		} while((x<-1000||x>1000)||(y<-1000||y>1000));

		
		if(x>0&&y>0) {
			System.out.println("1");
		} else if(x<0&&y>0) {
			System.out.println("2");
		} else if(x<0&&y<0) {
			System.out.println("3");
		} else if(x>0&&y<0) {
			System.out.println("4");
		}
	}
}
