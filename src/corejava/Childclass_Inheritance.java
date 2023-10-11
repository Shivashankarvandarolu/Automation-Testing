package corejava;

public class Childclass_Inheritance extends Parentclass_Inheritance
{
	int a = 10;
	int b = 20; 
	int c = 30;
	int d = 20;
	
	
	public void mul() {
		
		int a = 2;
		int b= 3;
		int c= 5;
		System.out.println(this.a*b*c); //10*3*5 =150
		
	}
	public void div() {
		
		int a = 150;
		
		System.out.println(a/d);
		System.out.println(a/super.d);
		
	}
	
	public static void main(String[] args) {
		Childclass_Inheritance x = new Childclass_Inheritance();
		
		x.mul();
		x.div();
		x.add();
		
	}

}


