package string;

import java.util.Scanner;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sara welcome  12345321";
		for(int i=0;i<s.length();i++) {
			 System.out.print(s.charAt(i)+" ");
		}
		System.out.println("Reverse a sstring");
		System.out.println("After String reverse");
		for(int i=s.length()-1;i>=0;i--) {
			 System.out.print(s.charAt(i)+" ");
		}
		
		
		
	}

}
/* output :
s a r a   w e l c o m e     1 2 3 4 5 3 2 1 Reverse a sstring
After String reverse
1 2 3 5 4 3 2 1     e m o c l e w   a r a s 


*/
