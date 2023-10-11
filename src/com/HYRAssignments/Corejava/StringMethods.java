package com.HYRAssignments.Corejava;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String a ="hello";
		String s ="Hello world";
		String s2 ="Hello world hello shiva how r u";
		String b ="Hello";
		String c ="heLLo";
		String a1 ="lskjdhksjdfhk jwbg@i4375y384  ";
		String a2="Hello  ";
		String a3="";
		String a4="   ";
		System.out.println(a);
		System.out.println(c);
		String d = new String("Hello");
		System.out.println(d);
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(b==d);
		
		//equals Method
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(b.equals(d));
		System.out.println(b.equals(c));
		
		
		//equalsignorecase Method
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(b.equalsIgnoreCase(d));
		System.out.println(b.equalsIgnoreCase(c));
		
		//startsWith Method
		System.out.println(a.startsWith("he"));
		System.out.println(a.startsWith("He"));
		System.out.println(b.startsWith("He"));
		System.out.println(d.startsWith("He"));
	
		//endsWith Method
		
		System.out.println(b.endsWith("Lo"));
		System.out.println(c.endsWith("lo"));
		System.out.println(a.endsWith("llo"));
		System.out.println(d.endsWith("lo"));
		
		//contains
		System.out.println(a.contains("l"));
		System.out.println(b.contains("L"));
		System.out.println(c.contains("LLo"));
		System.out.println(c.contains("H"));
		
		//String length method
		System.out.println(a1.length());
		System.out.println(a2.length());
		System.out.println(a3.length());
		System.out.println(a4.length());
		
		//Block and Empty Method
		System.out.println(a3.isEmpty());
		System.out.println(a4.isBlank());
		
		// trim Method
		System.out.println(a2.length());
		String a11= a2.trim();
		System.out.println(a11);
		System.out.println(a11.length());
		
		// lowercase and UpperCase Method
		System.out.println(a1.toLowerCase());
		System.out.println(a1.toUpperCase());
		
		//tochararray
		System.out.println(a);
		char[] s1 = a.toCharArray(); 
		
		// index of method
		System.out.println(a.indexOf("e"));
		System.out.println(a1.indexOf("g"));
		System.out.println(a1.indexOf("k"));
		System.out.println(a.indexOf("3"));
		System.out.println(a1.indexOf("j"));


		// lastIndexOf Method
		System.out.println(a1.lastIndexOf("j"));
		System.out.println(a1.indexOf("j"));
		
		// subString Method
		System.out.println(s.substring(4)); // int begin index
		System.out.println(s.substring(2,6)); // int begin index and end index
		
		//split method
		//System.out.println(Arrays.toString(s2.split(" ")));
		
		//charAt Method
		System.out.println(a.charAt(3));
		
		//replace and replaceall method
		System.out.println(a.replace("h", "w"));
		System.out.println(a.replaceAll("Hello", "Bolo"));
		
		String num = "344";
		int i =345;
		//converting string numeric to int
		// int to string
		System.out.println(Integer.valueOf(num));
		System.out.println(String.valueOf(i));
	}

}
