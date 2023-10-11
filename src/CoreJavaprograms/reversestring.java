package CoreJavaprograms;

import org.testng.annotations.Test;

public class reversestring {

	@Test(enabled = false)
	//using for loop
	public  void ReverseString() {
		
		String a = "shivashankarGoud";
		int len = a.length();
		System.out.println(len);
		
		String rev = "";
		
		for(int i=len-1 ; i>=0 ; i--) { // 
			rev = rev + a.charAt(i);
		}
		System.out.println("Reverse String of a is = " + rev);

	}
	
	@Test(enabled=false)
	public void Removespecialcharacters() {
		
		String a ="Shiava@69876sddjh&^&**%&^%";
		String b = "kjghgsdjh*^(*^*&%*&%(*586759675";
		// Regular Expression = [^a-zA-Z0-9];
		
		a = a.replaceAll("[^a-zA-Z0-9]","");
		b = b.replaceAll("[a-zA-Z0-9]", ""); 
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test(enabled=false)
	public void ReverseInteger() {
		int num = 234235 ;
		int revnum = 0;
		
		while(num != 0){ // (12345 !=0),(23423 !=0)
				revnum = revnum * 10 + num%10; // 0*10 + 12345%10 = 5, 23423%10 = 2342
				num = num/10; // 234235/10 = 23423
		}
		System.out.println(revnum);	
	}
	
	@Test
	public void Swaptwointegers() {
		int a = 5;
		int b = 10;
		
		System.out.println("Beforeswap a is =" + a);
		System.out.println("Beforeswap b is =" + b);
		
		a = a+b;  // a = 5+10 = 15
		b = a-b;  // b = 15-10 = 5
		a = a-b;  // a = 15-5 = 10
		System.out.println("Afterswap a is =" + a);
		System.out.println("Afterswap b is =" + b);
		
		

	}
	
	
		
	@Test(enabled=false)
	public void palindrome() {
		String a = "amma";
		int len = a.length();
		System.out.println(len);
		String b="";
		
		for(int i= len-1 ; i>=0 ; i--) {
			 b = b + a.charAt(i);
			 
		}
		System.out.println(b);
		
		
		if ( a == b) 
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not a palindrome");
		}
		
	}

}
