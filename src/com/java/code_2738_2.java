package com.java;

import java.util.Scanner;

public class code_2738_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputSize = sc.nextLine();
		String[] sizeArr = inputSize.split(" ",2);
		
		int n = Integer.valueOf(sizeArr[0]);
		int m = Integer.valueOf(sizeArr[1]);
		
		int[][] arr2D_sum = new int[n][m];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<n; j++) {
				String input = sc.nextLine();
				String[] inputArr = input.split(" ");
				for(int k=0; k<m; k++) {
					arr2D_sum[j][k] += Integer.valueOf(inputArr[k]);
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.printf("%-2d",arr2D_sum[i][j]);
			}
			System.out.println();
		}
	}
}
