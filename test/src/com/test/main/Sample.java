package com.test.main;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		int no = 0;
		Scanner s = new Scanner(System.in);
		no = s.nextInt();
		if (no % 2 == 0) {
			System.out.println("even");
		} else {

			System.out.println("even");
		}
	}
	
	/**
	 * This method is used to print name passed in as param.
	 * @param name
	 * @return String
	 */
	public static String printMyMethod(String name) {
		System.out.println("my print method"+name);
		return "executed";
	}

}
