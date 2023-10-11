package com.HYRAssignments.Corejava;

import java.util.Scanner;

public class Studentresultbasedonthe_GradingSystem {

	public static void main(String[] args) {

		Scanner marks = new Scanner(System.in);
		System.out.println("Enter Student marks to find out the grades ?");
		int stuMarks = marks.nextInt();

		if(stuMarks<35)
		{
			System.out.println("fail");
		}
		else if(stuMarks == 35)
		{
			System.out.println("pass");
		}
		else if(stuMarks > 35 && stuMarks <70)
		{
			System.out.println("third Class");
		}
		else if(stuMarks >70 && stuMarks <85)
		{
			System.out.println("Second Class");
		}
		else if(stuMarks >85)
		{
			System.out.println("FirstClass");
		}
	}
}