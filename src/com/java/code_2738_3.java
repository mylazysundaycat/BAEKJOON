package com.java;

import java.util.Scanner;

public class code_2738_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr2D_sum = new int[n][m];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<m; k++) {
					arr2D_sum[j][k] += sc.nextInt();
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(arr2D_sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}
