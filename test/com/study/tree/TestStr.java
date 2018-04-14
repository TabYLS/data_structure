package com.study.tree;

import java.io.File;

public class TestStr {
	
	public static void main(String[] args) {
		File f = new File("/home/yls");
		File[] listFiles = f.listFiles();
		
		System.out.println((int)'a');
		System.out.println((int)'z');
		
		System.out.println((int)'A');
		System.out.println((int)'Z');
		System.out.println(slave(100));
		
	}
	
	public static int slave(int n) {
		if(n == 0 || n ==1) {
			return n;
		}
		if(n % 2 == 0){
			return slave(n/2) +1;
		}else{
			return 1 + slave((n + 1) /2);
		}
	}

}
