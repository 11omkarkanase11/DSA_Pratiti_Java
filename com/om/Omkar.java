package com.om;

import java.util.Scanner;

public class Omkar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long start= System.nanoTime();
		System.out.println(factorial(n));
		long end = System.nanoTime()-start;
		System.out.println(end);
		System.out.println(fibonaci(n));
		System.out.println(fibonacii(n));
	}

	private static int fibonaci(int n) {
		
		int[] dp = new int[n+2];
		dp[0]=0;
		dp[1]=1;
		for(int i=2; i<=n; i++) {
			dp[i]= dp[i-1]+dp[i-2];
		}
		return dp[n];
		
	}

	private static int factorial(int n) {
		
		int[] dp = new int[n+1];
		dp[0] =1;
		
		for(int i=1; i<=n; i++) {
			dp[i]= dp[i-1]*i;
		}
		return dp[n];
		
	}
	
	public static int fibonacii(int n) {
		int a=0;
		int b= 1;
		int c=0;
		if(n==0) {
			c=0;
		}
		for(int i=2; i<=n; i++) {
			c= a+b;
			a=b;
			b=c;
		}
		return c;
		
	}

}
