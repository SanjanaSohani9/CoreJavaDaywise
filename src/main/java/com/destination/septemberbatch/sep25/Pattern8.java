package com.destination.septemberbatch.sep25;

import java.util.Scanner;

/*
 * 25	24	23	22	21
 * 20	19	18	17	16
 * 15	14	13	12	11
 * 10	9	8	7	6
 * 5	4	3	2	1
 */
public class Pattern8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		int rashmika = n*n;
		for(int katrina=1;katrina<=n;katrina++) //rows
		{
			for(int alia=1;alia<=n;alia++)
			{
				System.out.print(rashmika);
				System.out.print("	");
				rashmika--;
			}
			System.out.println();
		}
	}
}
