package com.bridgelabz;

import java.util.Scanner;

public class leapYearOrNot {
	public static void main(String[] args) {
		// Considering any random year
		int year;
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Year: ");
		year = scn.nextInt();
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 == 0))) {
			System.out.println(year + " : Leap Year");
		}
		else {
			System.out.println(year + " : Non - Leap Year");
		}
	}
}
