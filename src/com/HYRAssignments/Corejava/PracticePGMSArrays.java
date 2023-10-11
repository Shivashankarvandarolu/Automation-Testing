package com.HYRAssignments.Corejava;

public class PracticePGMSArrays {
	
	public void maxnumberinarray() {
		int a[] = new int[] {3,5,1,7,8,9};
		
		int max =a[0];
		int index = 0;
		
		for(int i=0; i< a.length ; i++)
		{
			if(max<a[i]) 
			{
				max=a[i];
				
			}	
			System.out.println(max);
		}
	}
	
	public static void main(String[] args) {
		PracticePGMSArrays obj = new PracticePGMSArrays();
		obj.maxnumberinarray();
	}
	
}

