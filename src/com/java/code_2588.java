package com.java;

import java.util.*;
public class code_2588 {
	public static void main(String[] args) {
		//�� �ڸ��� ���� �Է¹���
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//(1)*(2)��ù°�ڸ�
		int output1 = a*(b%10);
		//(1)*(2)�ǵ�°�ڸ�
		int output2 = a*((b%100)/10);
		//(1)*(2)�Ǽ�°�ڸ�
		int output3 = a*(b/100);
		//(1)*(2)�� �������
		int output4 = a*b;
		
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);
		System.out.println(output4);
		
	}
}
