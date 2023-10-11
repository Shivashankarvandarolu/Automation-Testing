package com.HYRAssignments.Corejava;

public class Assignmentarray {

	public void sumoftheintegerinarray() {
		int i[] = new int[5];
		i[0] = 2;
		i[1] = 5;
		i[2] = 1;
		i[3] = 9;
		i[4] = 6;

		int sum = i[0] + i[1] + i[2] + i[3] + i[4];
		System.out.println("Sum of the array index" + sum);
	}

	public void averageoftheintegersinarray() {
		int i[] = new int[5];
		i[0] = 2;
		i[1] = 5;
		i[2] = 3;
		i[3] = 9;
		i[4] = 6;

		int sum = i[0] + i[1] + i[2] + i[3] + i[4];
		System.out.println("average = " + sum / 5);
	}

	public void Findthemaxnumberinarraywithindex() {
		int a[] = new int[] { 2, 5, 1, 9, 344 };

		int max = a[0];
		int index = 0;
		
		int min = a[0];
	

		for (int i = 0; i < a.length; i++) // i=0 , i=1 ,
		{
			if (max < a[i]) {
				/*
				 * a[0] < a[0] = false a[0] < a[1] => 2 < 5 a[1] < a[2] => 5 < 1 => false a[1] <
				 * a[3] => 5 < 9 a[3] < a[4] => 9 < 344
				 */

				max = a[i]; // max = a[1] // max = a[3] // max = a[4]
				index = i;
			}
			
			if(min > a[i]) {
				max = a[i]; // max = a[1] // max = a[3] // max = a[4]
				index = i;
			}
		}

		System.out.println("Largestnumber = " + max);
		System.out.println("Smallest number = " + min);
		System.out.println("Largestnumber_index = " + index);
	}

	public void minlengthwordfromanarraywithindex() {

		String a[] = new String[] { "coffee", "wasster", "chai" };
		
		String word = a[0];
		int minlength = a[0].length();
		int index = 0;
		
		System.out.println(a[0].length());

		
		  for(int i=0 ; i<a.length ; i++)
		  {
			  
			/*  lenword = a[0].lenght() = 6
			    lenword = a[1].length() = 7
			    lenword = a[2].length() = 4
			*/
			  if(a[i].length() < minlength) 
				  // 6 < 6 = false
				  // 5 < 7 = true
				  // 7 < 4 = false  
			  {
				  index = i ;
				  word = a[i];
				  
			  }
		  }
		  System.out.println("minimum length of the word is = " + word);
		  System.out.println("minimum length of the word index is  = "+ index);
		  
		 
	}
	
	public void reversethearray() {
		String a[] = new String[] {"true","false","false","true","false","true"};
		
		String reversethearrray = a[0];
		
	
		for (int i=(a.length-1) ; i<a.length ; i--)
		{
			reversethearrray = a[i];
			System.out.println(reversethearrray);

		}
	}
	
	public void printtheduplicateelementsinarray() {
		int a[] = new int[] {1,3,3,4,5,6,3,1,2,6,9};
		int b[] = new int[] {1,5,6,4,1};
		
		
		for (int i=0 ; i<a.length ; i++) // a[0]=2
		{
			for (int j = 0 ; j< b.length ; j++) // a[1]=3
			{
				if(a[i]==b[j])   
				{
					System.out.println(a[i]);
				}
			}
		}
		
	}
	

	public static void main(String[] args) {
		Assignmentarray obj = new Assignmentarray();
			obj.sumoftheintegerinarray();
			obj.averageoftheintegersinarray();
			obj.Findthemaxnumberinarraywithindex();
			obj.minlengthwordfromanarraywithindex();
			obj.reversethearray();
			obj.printtheduplicateelementsinarray();
	}

}
