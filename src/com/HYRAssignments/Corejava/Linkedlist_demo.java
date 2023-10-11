package com.HYRAssignments.Corejava;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlist_demo {
	

public static void main(String[] args) {
	

		LinkedList obj = new LinkedList();
		
	//	LinkedList<Integer> obj1 = new LinkedList<Integer>();
	//	LinkedList<String> obj2 = new LinkedList<String> ();
		
		// add elements into linkedlist
		
		
		obj.add("Shiva");		
		obj.add(2);		

		obj.add(null);		

		obj.add("Thulasi");		

		obj.add("Ammu");
		
		obj.add(2, "ammulu");
		
		obj.remove(2);
		
		obj.remove(4);
		
		//Collections.sort(obj);
		//ystem.out.println("Ascedning Order =" + obj);
		//Collections.sort(obj,Collections.reverseOrder());
		//System.out.println(obj.get(3));
		for(int i=0 ; i<obj.size() ; i++)
		{
			System.out.println(obj.get(i));
		}

		
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		
}	

 	}

}
