package com.HYRAssignments.Corejava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {

	public void al() {
		
		ArrayList obj = new ArrayList(); // store Heterogeneous Data
		
		//ArrayList <String> obj1 = new ArrayList<String>(); // Stores only Homogeneous Data
		
		//ArrayList <Integer> obj2 = new ArrayList<Integer>(); // Store Only Homogeneous Data
		
		//List obj3 = new ArrayList();
		
		obj.add("Shivashankar Goud");
		obj.add(8);
		obj.add("Thulasi");
		obj.add(7);
		obj.add("Swapna");
		obj.add(8);

		obj.add(0,"Shiva");
		obj.add(1, "ammulu");
		obj.set(2, "Shanakr");
		System.out.println(obj.get(1));
		
		boolean con = obj.contains("ammulu");
		System.out.println(con);
		
		System.out.println(obj.isEmpty());

		
		obj.remove(2);
		//Collections.sort(obj);
		System.out.println(obj.size());
		
		System.out.println(obj);
	}
	
	public void alpgm() {
		ArrayList <Integer> obj = new ArrayList<Integer> ();
		obj.add(3);
		obj.add(23);
		obj.add(2);
		obj.add(22);
		obj.add(0);
		System.out.println(obj);
		
		Collections.sort(obj);
		System.out.println("Ascedning Order =" + obj);
		Collections.sort(obj,Collections.reverseOrder());
		
		System.out.println("Descending Order = " + obj);
	}
	
	public static void main(String[] args) {
		
		Arraylist al = new Arraylist();
		al.al();
		al.alpgm();
		
	}
}
