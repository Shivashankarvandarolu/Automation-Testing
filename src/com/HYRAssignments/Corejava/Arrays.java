package com.HYRAssignments.Corejava;

import org.testng.annotations.Test;

public class Arrays {
	
	@Test
	public void printsumofintegersofanarray() {
		int i[] = new int[5];
		int j[] = new int[5];
		String k[] = new String[2];
		String l[] = new String[3];
		
		k[0]="chai";
		k[1]="coffee";
		
		l[0]="milk";
		l[1]="water";
		l[2]="coke";
		
	
		
		i[0] = 2;
		i[1] = 5;
		i[2] = 1;
		i[3] = 9;
		i[4] = 6;
		
		j[0] = 2;
		j[1] = 5;
		j[2] = 3;
		j[3] = 9;
		j[4] = 6;
		
		int size = i.length;
		System.out.println(size);
		
		int sumi =i[0]+i[1]+i[2]+i[3]+i[4];
		System.out.println(sumi);
		
		int sumj =j[0]+j[1]+j[2]+j[3]+j[4];
		System.out.println(sumj);
		
		int average = sumj/size ;
		System.out.println(average);
		
		
	}

}
