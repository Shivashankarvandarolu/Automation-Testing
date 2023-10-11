package corejava;

public class Parentclass_Inheritance {
	int d =10;
	
	public void add() {
		
		int a = 2;
		int b= 3;
		int c= 5;
		System.out.println(a+b+c);
		
	}
	public void sub() {
		
		int a = 2;
		int b= 3;
		int c= 5;
		System.out.println(a+d);
		
	}
	
	public static void main(String[] args) {
		Parentclass_Inheritance obj = new Parentclass_Inheritance();
		obj.add();
		obj.sub();
		
	}

}
