package com.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class code_10807 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String num = br.readLine();
		
		String[] arr = (br.readLine()).split(" ");
		int sum = 0;
		
		int findNum = Integer.parseInt(br.readLine());
		
		for(int i=0; i<Integer.parseInt(num); i++) {
			if(Integer.parseInt(arr[i])==findNum) sum++;
		}
		
		bw.write(sum);
		bw.flush();
		
		bw.close();
		br.close();
				
	}
}
