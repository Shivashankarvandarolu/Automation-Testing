package com.HYRAssignments.Corejava;

public class PHS implements Interface{

	public void stuName() {
		String stu1 = "Arjun";
		System.out.println(stu1);
	}

	public void City() {
		String cityName = "Hyderabad";
		System.out.println(cityName);
	}

	public void section() {
		String sec = "12A";
		System.out.println(sec);
	}

	public void parentName() {
		String pName ="Abhi";
		System.out.println(pName);
	}
	
	@Override
	public void grade() {
		System.out.println("A+");
	}


	

}
