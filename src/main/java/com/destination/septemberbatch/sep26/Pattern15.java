package com.destination.septemberbatch.sep26;

import java.util.Scanner;

/*
 * #
 * # #
 * # - #
 * # - - #
 * # # # # #
 */
public class Pattern15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the size: ");
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1 || j==1 || i==n || j==i) {
					System.out.print("# ");
				}else {
					System.out.print("- ");
				}
			}System.out.println();
		}
	}
}
