package com.HYRAssignments.Corejava;

import java.util.Scanner;

public class Even_or_Odd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value to find given value is Even or ODD ?");
		int num = input.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println(num + " is Even number");
		}
		else
		{
			System.out.println(num + " is ODD number");
		}
		
	}

}
