package com.destination.septemberbatch.sep25;

import java.util.Scanner;

/*
 * 1 1 1 1 1
 * 2 2 2 2 2
 * 3 3 3 3 3
 * 4 4 4 4 4
 * 5 5 5 5 5
 */
public class Pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for(int katrina=1;katrina<=n;katrina++) //rows
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(katrina);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
