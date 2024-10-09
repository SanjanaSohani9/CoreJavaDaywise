package com.destination.septemberbatch.oct4;

import java.util.Scanner;


class ArrayOperation3{
	String arr[][][];
	int cls;
	int stu;
	int col;
	Scanner sc = new Scanner(System.in);

	void createArray(int m,int n,int o) {
		arr = new String[m][n][o];
		System.out.println("Array is created succesfully");
		System.out.println("============");
	}

	void addData() {
		System.out.println("Collecting array Data: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside Colleg No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside Class No: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of student no: "+(k+1));
					arr[i][j][k] = sc.next();
				}
			}
		}
		System.out.println("Names successfully collected");
		System.out.println("=============");
	}

	void display() {
		System.out.println("Display array Data: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside Colleg No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside Class No: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("The name of student no: "+(k+1)+" is= "+arr[i][j][k]);
				}
			}
		}
	}
}


public class Array3dCOde {
	public static void main(String[] args) {
		ArrayOperation3 ao3 = new ArrayOperation3();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the College count: ");
		int m = sc.nextInt();
		System.out.println("Enter the Class count: ");
		int n = sc.nextInt();
		System.out.println("Enter the Student count: ");
		int o = sc.nextInt();
		
		ao3.createArray(m,n,o);
		ao3.addData();
		ao3.display();
	}
}
