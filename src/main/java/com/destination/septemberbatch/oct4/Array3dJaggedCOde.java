package com.destination.septemberbatch.oct4;
import java.util.Scanner;

class ArrayOperation4{
	String[][][] arr;
	int col;
	Scanner sc = new Scanner(System.in);

	void createArray(int m) {
		arr = new String[m][][];

		//collecting class count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the class count inside college no: "+(i+1));
			int cls = sc.nextInt();
			arr[i] = new String[cls][];
		}
		//collecting student count
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside college no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("ENter the student count inside class no: "+(j+1));
				int stu = sc.nextInt();
				arr[i][j] = new String[stu];
			}
		}
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


public class Array3dJaggedCOde {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the college count: ");
		int m = sc.nextInt();
		
		ArrayOperation4 ao4 = new ArrayOperation4();
		ao4.createArray(m);
		ao4.addData();
		ao4.display();
	}
}
