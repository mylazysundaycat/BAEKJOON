package com.java;

import java.util.Scanner;

public class code_10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] strArr = new String[5][15];
		
		for(int i=0; i<5; i++) {
			String str = sc.nextLine();
			for(int j=0; j<str.length(); j++) {
				strArr[i][j] = String.valueOf(str.charAt(j));
			}
		}
		
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(strArr[j][i]!=null) {
					System.out.print(strArr[j][i]);
				}
			}
		}
	}
}
