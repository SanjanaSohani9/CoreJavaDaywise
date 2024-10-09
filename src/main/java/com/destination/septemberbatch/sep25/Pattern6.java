package com.destination.septemberbatch.sep25;

import java.util.Scanner;

/*
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 */
public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for(int katrina=1;katrina<=n;katrina++) //rows
		{
			for(int alia=1;alia<=n;alia++)
			{
				System.out.print(alia);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
