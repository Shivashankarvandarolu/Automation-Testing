package com.HYRAssignments.Corejava;

public class Arrayspgm {


	public void arry()
	{
		int stuid[] = new int[4];
		String stuName[] = new String[4];
		stuid[0] = 101;
		stuid[1] = 102;
		stuid[2] = 103;
		stuid[3] = 104;
		
		stuName[0] = "Shiva";
		stuName[1] = "Arjun";
		stuName[2] = "Abhi";
		stuName[3] = "Vani";
		
		for(int i=0 ; i < stuid.length ; i++)
		{
			System.out.println(i);
		}
		
		for(int i=0 ; i< stuName.length ; i++)
		{
			System.out.println(i);
		}
		

		
	}
	public static void main(String[] args) {

		Arrayspgm obj = new Arrayspgm();
		obj.arry();
	}
	
}
