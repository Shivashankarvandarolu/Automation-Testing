package com.HYRAssignments.Corejava;

public class HyrStringpgms {

	public void countthenumberofcharacterinastring() {
		String a = "java is Super";
		int len_a = a.length();
		System.out.println("Number of characters in a given string ="+ len_a);
		
	}
	
	public void countthenumberofwordsinastringI() {
		String a = "java is super";
		String arr[] = a.split(" ");
		System.out.println("Number of words in a given string ="+ arr.length);
	}
	
	public void countthenumberofoccurenceofcharacterigivenstring() {
		String a = "hello world";
		int len_a = a.length();
		
		String removing_character_l = a.replaceAll("o","");
		int after_removing_character_l = removing_character_l.length();
		
		int total_occurences = (len_a - after_removing_character_l);
		System.out.println(total_occurences);
		
	}
	
	public void reverseastring() {
		String a = "shiva";
		String reverse = "";
		int len_a = a.length();
		 
		
		for(int i= len_a-1; i>=0 ; i--)
		{
			 reverse =reverse+ a.charAt(i);
		}
			System.out.println(reverse);
	}
	
	public void removestringandendingspacesfromastring() {
		String a = "   hello world  ";
		String trim = a.trim();
		System.out.println(trim);
		
	}
	
	public void reverseeachwordofagivenstring() {
		
		String a = "java is super";
		int len_a = a.length();
		String reverse = "";
		//String b="";
		
		for (int i=len_a-1 ; i>=0 ; i--)
		{
			reverse = reverse + a.charAt(i);
			
		}
		System.out.println(reverse);
	}
	

	
	public static void main(String[] args) {
		HyrStringpgms obj = new HyrStringpgms();
		obj.countthenumberofcharacterinastring();
		obj.countthenumberofwordsinastringI();
		obj.countthenumberofoccurenceofcharacterigivenstring();
		obj.reverseastring();
		obj.removestringandendingspacesfromastring();
		obj.reverseeachwordofagivenstring();
	}
}
