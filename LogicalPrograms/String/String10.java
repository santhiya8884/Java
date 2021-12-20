package string;

import java.util.Scanner;

public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Integer  to String ..");
		Integer a=20;
		//String s1="sara";    //Runtime error ----- number format exception
		System.out.println(a+100000);
		String s=a.toString();
		System.out.println(s+100000);
		
		
	}

	
}
/* output :
 Integer  to String ..
100020
20100000
*/
