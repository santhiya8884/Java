package generics_18_11_2021;

import java.util.ArrayList;
import java.util.Collections;

public class GenericCompileTime18_11_2021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//with generics.....
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(true);
		al.add(50);
		al.add(40);
		Collections.sort(al);
		System.out.println(al);
	}

}


/* output :
 
 Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (boolean)

	at generics_18_11_2021.GenericCompileTime18_11_2021.main(GenericCompileTime18_11_2021.java:14)
*/
