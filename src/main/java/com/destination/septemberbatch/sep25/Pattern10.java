package com.destination.septemberbatch.sep25;

import java.util.Scanner;

/*
 * 1
 * 2 2 
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */
public class Pattern10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) //rows
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
