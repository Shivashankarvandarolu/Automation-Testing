package com.HYRAssignments.Corejava;

public class Arrayspgms {
	
	public void Initializevaluestoarray() {
		int a[] = new int[5] ;
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		int len_array = a.length;
		System.out.println("size of the array is = " + len_array);
		
		
		
		String name[]= new String[2];
		name[0] = "Shiva";
		name[1] ="Shankar";
		
		int size = name.length;
		System.out.println( "Size of the name array = "+ size);
		
		//System.out.println(name[1]);
		//System.out.println(a[4]);
		
		
		// Printing the values in sequential Order
		for (int i=0 ;i<a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
		// Printing the string values in an order
		for(int i=0 ; i<name.length ;i++)
		{
			System.out.println("name is = " + name[i]);
		}
		
		//printing the values in reverse Order
		for(int i=len_array -1 ; i<len_array ; i-- )
		{
			System.out.println(a[i]);
		}
		
		for(int i= (name.length)-1 ; i<name.length ; i--)
		{
			System.out.println(name[i]);
		}
	}
	
	public void arraystring() {
		String empname[] =  new String[] {"Shiva","Shanakr" ,"Goud" ,"Ammulu" , "Arjun" , "Swapna"};
		int size = empname.length;
		System.out.println(size);
		
		System.out.println("Ascending Order");
		System.out.println("-----------------");
		for(int i=0 ; i<size ; i++)
			
		{
			System.out.println(empname[i]);
		}
		
		System.out.println("Descending Order");
		System.out.println("-----------------");
		for(int i=size-1 ; i<=size ; i--)
		{
			System.out.println(empname[i]);
		}
		
		
	}
	
	public void arrayreverse() {
		String obj[] = new String[] {"true" , "false" ,"false","true","true","false"};
		
		int size_obj = obj.length;
		System.out.println(size_obj);
		String reverse ="";
		
		for (int i=size_obj-1 ; i < size_obj ; i--)
		{
			reverse = obj[i];
		}
		System.out.println(reverse);
	}
	
	public void minandmaxvalueinarray() {
		int a[] = new int[] {3,5,7,1,9,1};
		int max = a[0];
		int index = 0;
		
		for(int i=0 ; i<a.length ;i++)
		{
			if(max<a[i])
			{
				max = a[i];
				index = i;
			}
			System.out.println(a[i]);
				
			}
		}
		
		
	
	
	public void reversestring() {
		
		String a = "abhimanyudu";
		
		String reverse = "";
		
		int len_a = a.length();
		
		for(int i=len_a-1; i>=0 ;i--)
		{
			reverse = reverse + a.charAt(i);
			
		}
		System.out.println(reverse);
		
	}
	
	public static void main(String[] args) {
		
		Arrayspgms iva = new Arrayspgms();
			iva.Initializevaluestoarray();
			//iva.arraystring();
			//  iva.reversestring();
			//iva.arrayreverse();
			//	iva.minandmaxvalueinarray();
	}

}
