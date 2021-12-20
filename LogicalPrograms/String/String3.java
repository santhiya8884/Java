package string;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="santhiya 12345678901234 welcome 1234567890";
		s=s.toLowerCase();
		int count=0;
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)>=48&&s.charAt(i)<=57) { 
				 count++;
			 }
		}
		System.out.println("Numbers count "+count);
		
	}

}
/* output :
 
Numbers count 24

*/
