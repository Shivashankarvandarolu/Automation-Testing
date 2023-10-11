package CoreJavaprograms;

import org.testng.annotations.Test;

public class PGMS {
	
	@Test
	public void ReverseInteger() {
		 int num = 2353;
		 int revnum =0;
		 
		 while(num !=0) {
			 revnum = revnum * 10 + num %10;
			 num = num/10;
			
		 }
		 System.out.println(revnum);
	}
	
	@Test
	public void intpalindrome() {
		 int num = 1441;
		 int revnum =0;
		 
		 while(num !=0) {
			 revnum = revnum * 10 + num %10;
			 num = num/10;
			
		 }
		if(num == revnum) {
			System.out.println("String is a palidrome");
			}
			else {
				System.out.println("Not a palindrome");
			}
		}
		
		 
	
	@Test
	public void reversestring() {
		
		String a = "raknahS";
		int len = a.length();
		
		String rev  ="";
		
		for(int i=len-1 ; i>=0 ; i--)
		{
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);
		
	}
	
	@Test
	public void stringpalindromeornot() {
		
		String a = "medam";
		int len = a.length();
		
		String rev  ="";
		
		for(int i=len-1 ; i>=0 ; i--)
		{
			rev = rev + a.charAt(i);
		}
		
		if(a.equals(rev)) {
			System.out.println("String is a palidrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
	
	@Test
	public void swaptwo() {
		int a =10;
		int b = 15;
		
		a = a+b; // 10+15 = 25 , a= 25
		b =a -b; // 25-15 , b=10
		a =a-b; // 25 - 10 = 15;
		System.out.println(a);
		System.out.println(b);
		
	}
	@Test
	public void reversearray() {
		
		int[] array = {3,5,5,65,2,7,2};
		int len = array.length;
		
		
		for (int i=len-1;i>=0;i--)
		{
			System.out.println("");
		}
	}
	
	
}

