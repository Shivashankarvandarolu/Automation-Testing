package com.HYRAssignments.Corejava;

import org.testng.annotations.Test;

public class Whiledowhileloop {
	
	
	public void Print1to100valuesusing_() {
		int i = 1;
		
		while (i<=100) {
			System.out.println(i);
			i++;
		}
	}
	
	
	public void print1to100usingforloop() {
		int i =1;
		
		for(i=1 ; i<=100 ; i++ )
		{
			System.out.println(i);
		}
		
	}
	
	public void Printevennumbersbetween200and500() {
		
		int i =200;
		
		while (i>=200 && i<=500) {
			
			if(i%2 ==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	
	
	public void printevennumberbetween200and500_using_forloop() {
		int i = 200;
		
		for(i=200 ; i<=500 ; i++)
		{
			if(i%2 ==0)
			{
				System.out.println(i);
			}
		}
		
		
	}
	
	
	
	public void Printthenumberswhicharedivisibleby_7_fortherangeof_150_to_200() {
		 
		int i=150;
		
		while(i>=150 && i<=200) {
			
			if(i%7 == 0)
			{
				System.out.println(i);
			}
			i++;
		}
		
	}
	
	
	
	public void Printthenumberswhicharedivisibleby_7_fortherangeof_150_to_200_usingforloop() {
		 int i=150;
		 
		 for(i=150 ; i<=200 ; i++)
		 {
			 if(i%7==0)
			 {
				 System.out.println(i);
			 }
		 }
		
	}
	public void printthesumofevennumbersbetween40to80() {
		
		int i = 40;
		
		while(i>=40 && i<=80) {
			
			if(i%2==0)
			{
		
			}
			i=i+1;
			
			i++;
		}
	}
	
	
	public void printtheODDnumbers200_to_25_reverseOrder(){
	
		int i =200;
		while(i<=200 && i>=25) {
			if(i%2 != 0)
			{
				System.out.println(i);
			}
			i--;
		}
		
	}
	
	@Test
	public void printtheODDnumbers200_to_25_reverseOrder_using_forloop() {
		int i = 200;
		
		for(i=200 ; i>=25 ; i--)
		{
			if(i%2 !=0)
			{
				System.out.println(i);
			}	
		}
	}
	
	
	
	public void reverseint() {
		
			int i = 2347;
			int a[] = new int[5];
			a[0]=12;
			a[1]=3;
			a[2]=3;
			a[3]=4;
			a[4]=3;
		
			int rev=0;
		while(i>0)
		{
			if(i/10 ==0)
			{
				rev = rev + i;
			}
		}
	}
	
	

}
