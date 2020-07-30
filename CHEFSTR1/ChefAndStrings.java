package com.codechef.programs;

import java.util.Scanner;

public class ChefAndStrings {
	
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);

		int test_cases = sc.nextInt();
		
		for (int i = 0; i < test_cases; i++) {
			
			int strings_to_pluck = sc.nextInt();
			
			int[] strings_to_pluck_arr = new int[strings_to_pluck];
			
			for (int j = 0; j < strings_to_pluck_arr.length; j++) {
		
				strings_to_pluck_arr[j] = sc.nextInt();
			}
			
			System.out.println(calculateStringsSkipped(strings_to_pluck_arr));
			
		}	
		sc.close();
	}
	
	public static int calculateStringsSkipped(int[] strings_to_pluck_arr) {
		
		int sum = 0;
		
		for (int i = 0; i < strings_to_pluck_arr.length - 1; i++) {
			int a = strings_to_pluck_arr[i];
			int b = strings_to_pluck_arr[i + 1];
			
			sum = sum + Math.abs(a - b) - 1;
		}
		
		return sum;
	}
}
