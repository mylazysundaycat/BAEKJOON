package com.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class code_10951 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0;
		
		while(true) {
			String str = br.readLine();
			if(str==null) {
				continue;
			}
			String[] arr = str.split(" ");
			sum = Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
			System.out.println(sum);
			sum = 0;
		}
		
	}
}
