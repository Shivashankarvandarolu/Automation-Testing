package Wipro.CoreJavapgms;

import java.util.Scanner;

public class NegativeorPositive {
	
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find number is Even or odd ?");
		int i = input.nextInt();
		
		if(i>=0)
		{
			System.out.println(i + " is a positive number");
		}
		else if(i<0)
		{
			System.out.println(i + " is a negative number");
		}
	}

}
