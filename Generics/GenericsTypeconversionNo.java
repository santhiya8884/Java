package generics_18_11_2021;

import java.util.ArrayList;

public class GenericsTypeconversionNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("Santhiya");
		al.add("Ram");
		String s=al.get(0);
		ArrayList<Character> al1=new ArrayList<Character>();
		al1.add('s');
		al1.add('r');
		//typeconversion is not allowd for the generics
		String sc=String(al1.get(1));
		System.out.println(s);
	}

}
/*output :
 
 Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method String(Character) is undefined for the type GenericsTypeconversionNo

	at generics_18_11_2021.GenericsTypeconversionNo.main(GenericsTypeconversionNo.java:16)
	
	
//	*/
