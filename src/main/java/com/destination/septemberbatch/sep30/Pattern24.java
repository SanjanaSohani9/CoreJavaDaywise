package com.destination.septemberbatch.sep30;

import java.util.Scanner;

public class Pattern24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		char c = 'A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}

	}
}
