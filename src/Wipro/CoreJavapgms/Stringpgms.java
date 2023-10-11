package Wipro.CoreJavapgms;

public class Stringpgms {

	public void countthenumberofcharactersinastring() {
		String a = "Shiva";
		int length = a.length();
		System.out.println(length);
	}
	
	public void reversestring() {
		String a = "Shiva";
		String reversestring ="";
		int len = a.length(); //5
		
		for (int i=len-1; i>=0 ; i--) // i=5-1=> 4 ; 4>=0
		{
			reversestring =  reversestring + a.charAt(i) ;
			
		}
		System.out.println(reversestring);
		
	}
	
	public void palindromeornot() {
		
		String name = "Ammulu";
		int len_name = name.length();
		String reverse = "";
		
		for (int i = len_name-1 ; i>=0 ; i--)
		{
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
		
		if(name==reverse)
		{
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given string is not a palindrome");
		}
	}
	
	public void countthenumberofoccurencesinagivenstring() {
		String h = "shivashankarGoud";
		int len_h = h.length();
		
		String occurenceletter = h.replace("s", "");
		int len = occurenceletter.length();
		
		int Count = len_h - len;
		System.out.println(Count);
		
	}
	
	public void removeendingspaces() {
		String a = "     Shiva           ";
		String b = a.trim();
		int len_a = a.length();
		int len_b = b.length();
		System.out.println(b);
		System.out.println(len_a);
		System.out.println(len_b);
	}
	
	public void swaptwonumbersiwithoutusingthirdvariable() {
		int a = 10;
		int b = 5 ;
		
		a = a+b ;  // a = 10+5 = 15
		b = a-b ;  // b = 15-5 = 10
		a = a- b ; // a = 15-10 = 5
		System.out.println("a = " +  a);
		System.out.println("b = " + b);
			
	}
	public static void main(String[] args) {
		Stringpgms ss = new Stringpgms();
		ss.countthenumberofcharactersinastring();
		ss.reversestring();
		ss.palindromeornot();
		ss.countthenumberofoccurencesinagivenstring();
		ss.removeendingspaces();
		ss.swaptwonumbersiwithoutusingthirdvariable();
	}
}
	

