package com.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class code_15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String str = br.readLine();
			bw.write(Integer.parseInt(str.split(" ")[0])+Integer.parseInt(str.split(" ")[1])+"\n");
			
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
