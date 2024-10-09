package com.destination.septemberbatch.oct3;

import java.util.Scanner;

class ArrayOperation2{
	int arr[][];
	int cls;
	Scanner sc = new Scanner(System.in);

	void createArray(int n) {
		cls = n;
		arr = new int[n][];
		System.out.println("Collecting Student count for each class: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the student count inside class no: "+(i+1));
			int stu = sc.nextInt();
			arr[i] = new int[stu];
		}
		System.out.println("Array is created succesfully");
		System.out.println("============");
	}

	void addData() {
		
		System.out.println("Collecting array Data: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside Class No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the marks of student no: "+(j+1));
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Marks successfully collected");
		System.out.println("=============");
	}

	void display() {
		System.out.println("Display array Data: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside Class No: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("the marks of student no: "+(j+1)+" is= "+arr[i][j]);
			}
		}
	}
}

public class ArrayProgram3 {
	public static void main(String[] args) {
		ArrayOperation2 ao2 = new ArrayOperation2();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the Class count: ");
		int cls = sc.nextInt();
		
		ao2.createArray(cls);
		ao2.addData();
		ao2.display();
	}
}
