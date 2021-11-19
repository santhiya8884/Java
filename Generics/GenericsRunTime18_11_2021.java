package generics_18_11_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GenericsRunTime18_11_2021  implements Comparable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();   ///non_Generic used.....
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(true);
		al.add(50);
		al.add(40);
		Collections.sort(al); ///the sort will ba error in rumtime occur
		System.out.println(al);
		
		
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
/* runtime error :
 
 Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Boolean (java.lang.Integer and java.lang.Boolean are in module java.base of loader 'bootstrap')
	at java.base/java.lang.Boolean.compareTo(Boolean.java:45)
	at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:325)
	at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
	at java.base/java.util.Arrays.sort(Arrays.java:1315)
	at java.base/java.util.Arrays.sort(Arrays.java:1509)
	at java.base/java.util.ArrayList.sort(ArrayList.java:1750)
	at java.base/java.util.Collections.sort(Collections.java:145)
	at generics_18_11_2021.GenericsCompileTime18_11_2021.main(GenericsCompileTime18_11_2021.java:18)

*/
