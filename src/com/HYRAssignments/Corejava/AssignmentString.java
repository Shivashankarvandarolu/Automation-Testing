package com.HYRAssignments.Corejava;

import java.util.Scanner;

import org.apache.batik.apps.rasterizer.Main;
import org.testng.annotations.Test;

public class AssignmentString {
	
	
	public void Findnumberof_CharactersinaString() {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter string");
		String  a = obj.nextLine();
		System.out.println(a.length());

	}
		
	@Test(enabled=false)
	public void CountWords_String() {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter string");
		String  a = obj.nextLine();
		
		//int wordCount = countWords(a);
		//System.out.println(wordCount);
	
	}



	}


