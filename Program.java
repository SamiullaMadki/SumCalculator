package com.project;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("The sum of the two numbers is " +sum);
		sc.close();
	}

}
