package com.destination.septemberbatch.sep25;

import java.util.Scanner;

/*
 * 1	2	3	4	5
 * 6	7	8	9	10
 * 11	12	13	14	15
 * 16	17	18	19	20
 * 21	22	23	24	25
 */
public class Pattern7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		int rashmika = 1;
		for(int katrina=1;katrina<=n;katrina++) //rows
		{
			for(int alia=1;alia<=n;alia++)
			{
				System.out.print(rashmika);
				System.out.print("	");
				rashmika++;
			}
			System.out.println();
		}
	}
}
