package coll_14_11_2021;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				SetPractice s1=new SetPractice();
				SetPractice s2=new SetPractice();
				ArrayList  al=new ArrayList();
				al.add(s1);
				al.add(s2);
				System.out.println(al);
				Collections.sort(al);
				
				
			}
			/*public String toString() { 
				return "HAi";
			}
*/
		}
/* 
[HAi, HAi]
Exception in thread "main" java.lang.ClassCastException: class coll_14_11_2021.SetPractice cannot be cast to class java.lang.Comparable (coll_14_11_2021.SetPractice is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
	at java.base/java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:320)
	at java.base/java.util.ComparableTimSort.sort(ComparableTimSort.java:188)
	at java.base/java.util.Arrays.sort(Arrays.java:1315)
	at java.base/java.util.Arrays.sort(Arrays.java:1509)
	at java.base/java.util.ArrayList.sort(ArrayList.java:1750)
	at java.base/java.util.Collections.sort(Collections.java:145)
	at coll_14_11_2021.Collection_sort.main(Collection_sort.java:17)
	*/
