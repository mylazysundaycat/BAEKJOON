package com.java;

public class code_2447 {
    public static void main(String[] args) {
        System.out.println(recursion(10));
    }
    static public String recursion(int n){
        if(n==0) { return "*"; }
        return recursion(n-1);
    }

}
