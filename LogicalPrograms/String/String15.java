package string;

import java.util.Arrays;
import java.util.Scanner;

public class String15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="peek";
		String s2="keep";
		 s1=s1.replaceAll("\\s", "");
		 s2=s2.replaceAll("\\s", "");
		 boolean flag=true;
		 if(s1.length()!=s2.length()) { 
			 flag=false;
			 
		 }
		 else { 
			char[] ss1=s1.toLowerCase().toCharArray();
			char[] ss2=s2.toLowerCase().toCharArray();
			/*
			 * System.out.println(ss1); System.out.println(ss2);
			 */
			Arrays.sort(ss1);
			Arrays.sort(ss2);
			/*
			 * System.out.println(ss1); System.out.println(ss2);
			 */
			flag=Arrays.equals(ss1, ss2);
			if(flag) { 
				System.out.println(s1+" and "+s2+" are Anagram");
			}
			else { 
				System.out.println(s1+" and "+s2+" are  not Anagram");
			}
		 }
		
		
	}

	
}
/* output :
peek and keep are Anagram



*/
