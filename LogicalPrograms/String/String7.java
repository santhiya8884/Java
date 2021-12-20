package string;

import java.util.Scanner;

public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String palindrome");
		String s="madam";
		int j=s.length()-1;
		boolean flag=true;
		for(int i=0;i<s.length()/2;i++,j--) {
			 if(s.charAt(i)!=s.charAt(j)) { 
				 flag=false;
				 System.out.println("Not palindrome ");
				 break;
			 }
			// j--;
		}
		if(flag) {
			System.out.println(s+" Palindrome");
		} 
		
		
		
		
	}

}
/* output :
String palindrome
madam Palindrome
*/
