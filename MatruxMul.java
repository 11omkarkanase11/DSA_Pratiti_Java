package com.om;

import java.util.Scanner;

public class MatruxMul {
	
	public static void main(String[] args) {
		System.out.println("Enter the Matrix Size:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matrix = new int[n][m];
		
		for(int i=0; i<n;i++) {
			for(int j=0;j<m; j++) {
				matrix[i][j]= sc.nextInt();
			}
		}
		System.out.println("Enter the second Matrix ize:");
		
		int n1 = sc.nextInt();
		int m1 = sc.nextInt();
		int[][] matrix1 = new int[n1][m1];
		
		for(int i=0; i<n;i++) {
			for(int j=0;j<m; j++) {
				matrix[i][j]= sc.nextInt();
			}
		}
		int[][] result = new int[n][m1];
		if(m == n1) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<m1; j++) {
					for(int k=0; k<m; k++) {
						 result[i][j] += matrix[i][k] * matrix1[k][j];
					}
				}
			}
		}
		else {
			System.out.println("Not Matched");
			
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<m1; j++) {
				System.out.println(result[i][j]);
			}
		}
		
	}

}
