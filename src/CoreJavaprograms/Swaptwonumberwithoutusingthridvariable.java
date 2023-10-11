package CoreJavaprograms;

public class Swaptwonumberwithoutusingthridvariable {
	public static void main(String[] args) {
		
		int a =5;
		int b = 10;
		
		//a = a+b;
		//b = a-b;
		//a = a-b;
		//System.out.println("a= " + a);
		//System.out.println("b= " + b);
		
	     System.out.println("Before swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	        // Swap the numbers without a third variable
	        a = a + b;
	        b = a - b;
	        a = a - b;

	        System.out.println("After swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	}

}
