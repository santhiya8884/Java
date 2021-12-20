package string;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="santhiya";
		s=s.toLowerCase();
		int count=0;
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') { 
				 count++;
			 }
		}
		System.out.println("Vowels count "+count);
		
	}

}
/* output :
 
Vowels count 3

*/
