package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code_25314 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		
		do {
			n = Integer.parseInt(br.readLine());
		}while(n%4!=0);
		
		for(int i=0; i<n/4; i++) {
			System.out.print("long"+" ");
		}
		System.out.print("int");
		br.close();
	}	
}
