package corejava;

public class Type_of_variable {
	int d ; // instance variable
	static int S ; // static variable
	int c = 50;
	
	public void variables(int a, int b) 
	{
		int c = 25; // local Variable
		//System.out.println(a+b);
		System.out.println(b+c); //Here value of c is a local variable so first priority is Local variable only. If we want the 
									//instance variable for that we need to apply this keyword.
		System.out.println(b+this.c); //Here acess instance variable;
		//System.out.println(b+c+a+d);
		//System.out.println(a+S);
		//System.out.println(S+d);
	}
	
	public static void main(String[] args) 
	    {
			Type_of_variable obj = new Type_of_variable();
			S=30;
			obj.d=30;
			obj.variables(10, 20);
		}

}
