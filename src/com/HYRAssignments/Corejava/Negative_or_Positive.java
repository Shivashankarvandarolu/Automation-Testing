package com.HYRAssignments.Corejava;

import java.util.Scanner;

public class Negative_or_Positive {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Enter number to find number is Even or odd ?");
			int num = input.nextInt();
			
			if(num>0)
			{
				System.out.println("Given number is Positive");
			}
			else
			{
				System.out.println("Given number is Negative");
			}
			
			
	}

}
