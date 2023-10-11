package com.HYRAssignments.Corejava;

public interface Interface {
	
	public void stuName();
	
	public void City();
	
	public void section();
	
	public void parentName();
	
	default void grade() {
	System.out.println("A");
	}
	
	static void fav() {
		System.out.println("AA");
	}
}
