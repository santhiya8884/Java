package utility_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class Array_List_Sort implements Comparable{
	int value;
	public Array_List_Sort(int i) {
		// TODO Auto-generated constructor stub
		this.value=i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a[]= {10,80,60,90,1,25};
		 * 
		 * for(int i:a) { System.out.println(i); }
		 * 
		 * Arrays.sort(a); System.out.println(a); for(int i:a) { System.out.println(i);
		 * }
		 * 
		 * 
		 * ArrayList al= new ArrayList(); al.add(10); al.add(990); al.add(100);
		 * al.add("sara"); al.add(30); al.add(50); al.add(50); al.add(80);
		 * 
		 * 
		 * System.out.println(al); Collections.sort(al); System.out.println(al);
		 */

		Array_List_Sort s1 = new Array_List_Sort(10);
		Array_List_Sort s2 = new Array_List_Sort(50);
		Array_List_Sort s3 = new Array_List_Sort(70);
		Array_List_Sort s4 = new Array_List_Sort(90);
		Array_List_Sort s5 = new Array_List_Sort(1);

		ArrayList al2 = new ArrayList();
		al2.add(s1);
		al2.add(s2);
		al2.add(s3);
		al2.add(s4);
		al2.add(s5);
		//System.out.println();
		System.out.println(al2);
		Collections.sort(al2);
		System.out.println(al2);
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Array_List_Sort g=(Array_List_Sort)arg0;
		if(this.value>g.value) { 
			return 5;
		}
		else if(this.value<g.value) { 
			return -5;
		}
		else { 
			return 0;
		}
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Array_List_Sort other = (Array_List_Sort) obj;
		return value == other.value;
	}

	@Override
	public String toString() {
		return this.value+"" ;
	}
	
}
/* output :
 [10, 50, 70, 90, 1]
[1, 10, 50, 70, 90]
*/
