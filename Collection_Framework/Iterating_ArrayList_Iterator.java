package collec_practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterating_ArrayList_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();//creating a ArrayList
		al.add(5);
		al.add("sara");
		al.add(true);
		al.add(5.6f);
		al.add("S");
		System.out.println(al);
		al.add(2, "new added");
		System.out.println(al);
		ArrayList al2=new ArrayList();
		al2.add(70);
		al2.add('c'); // Adding a Object in ArrayList 
		al2.addAll(1,al);
		System.out.println(al2);
		Iterator itr=al.iterator();
	}

}
