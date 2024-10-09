package com.destination.septemberbatch.oct1;

import java.util.Scanner;

class ArrayOperation2{
	int arr[][];
	int cls;
	int stu;

	void createArray(int n,int m) {
		cls = n;
		stu = m;
		arr = new int[n][m];
		System.out.println("Array is created succesfully");
		System.out.println("============");
	}

	void addData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Collecting array Data: ");
		for(int i=0;i<cls;i++) {
			System.out.println("Inside Class No: "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Enter the marks of student no: "+(j+1));
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Marks successfully collected");
		System.out.println("=============");
	}

	void display() {
		System.out.println("Display array Data: ");
		for(int i=0;i<cls;i++) {
			System.out.println("Inside Class No: "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("the marks of student no: "+(j+1)+" is= "+arr[i][j]);
			}
		}
	}
}

public class ArrayProgram2 {
	public static void main(String[] args) {
		ArrayOperation2 ao2 = new ArrayOperation2();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the Class count: ");
		int cls = sc.nextInt();
		System.out.println("Enter the student count: ");
		int stu = sc.nextInt();
		ao2.createArray(cls, stu);
		ao2.addData();
		ao2.display();
	}
}
