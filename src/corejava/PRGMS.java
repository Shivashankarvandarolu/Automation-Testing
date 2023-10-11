package corejava;

import org.testng.annotations.Test;

public class PRGMS {
	
	@Test
	public void ReverseInteger() {
		 int num = 2350;
		 int revnum =0;
		 
		 while(num !=0) {
			 revnum = revnum * 10 + num %10;
			 revnum = num/10;
			
		 }
		 System.out.println(revnum);		
		
	}
}
