package com.bridgelabz;

import java.util.Scanner;

public class sumOfNaturalNumberInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enterting number : ");
		int start = sc.nextInt();
		System.out.print("Enterng number : ");
		int end = sc.nextInt();
		int sum = 0;
		for (int i = start; i <= end; i++)
		sum = sum + i;
		System.out.print("numbers in the range from " + start + " to " + end + " is " + sum);
		}
	}
