package coll_14_11_2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSet_Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet s=new HashSet();
		System.out.println(s);
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(50);
		System.out.println(s);
		s.add("santhiya");
		System.out.println(s);
		s.add(100);
		System.out.println(s);
		//insertion order : linkd=ed hashset
		/*
		 * LinkedHashSet ll=new LinkedHashSet(s); System.out.println(ll);
		 */
		
		
	}

}
/* output:
 []
[50, 20, 10, 30]
[santhiya, 50, 20, 10, 30]
[santhiya, 50, 20, 100, 10, 30]
*/
