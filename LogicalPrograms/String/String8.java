package string;

import java.util.Scanner;

public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String to CharArray..");
		String s="madam";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			System.out.print(ch[i]+" ");
		} 
		
		
	}

}
/* output :
String to CharArray..
m a d a m 
*/
