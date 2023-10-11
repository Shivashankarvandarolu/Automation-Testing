package OOPS;

public class Class_and_Objects {
	
	public void add(int a,int b) {
		int c = a+b;
		System.out.println("Additon:"+c);		
	}
	public void Sub(int a, int b) {
		int c = a-b;
		System.out.println("Subtraction:"+c);
	}
	public static void main(String[] args) {
		// classname<objectname> = new classname
		
		Class_and_Objects obj = new Class_and_Objects();
		obj.add(12,12);
		
		obj.Sub(12, 12);
		obj.add(8, 65);
		obj.add(20, 25);
	}

}
