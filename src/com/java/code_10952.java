package com.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class code_10952 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0;
		
		while(true) {
			String[] arr = br.readLine().split(" ");
			sum = Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
			if(sum==0) {
				break;
			}
			bw.write(sum+"\n");
			sum=0;
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
