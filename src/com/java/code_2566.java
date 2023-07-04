package com.java;

import java.util.Scanner;

public class code_2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] numArr = new int[9][9];
		int max = 0;
		int width = 0;
		int length = 0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				numArr[i][j] = sc.nextInt();
			}
			
			for(int j=0; j<9; j++) {
				if(max<numArr[i][j]) {
					max = numArr[i][j];
					width = i;
					length = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.print((width+1)+" "+(length+1));
		
	}
}
