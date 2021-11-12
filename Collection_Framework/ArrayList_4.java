package collec_practice;

import java.util.ArrayList;

public class ArrayList_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1=new ArrayList();//creating a ArrayList
		list1.add(5);
		list1.add("sara");
		list1.add(true);
		list1.add(5.6f);
		list1.add("S");
		System.out.println(list1);
		list1.add(2, "new added");
		System.out.println(list1);
		ArrayList list2=new ArrayList();
		list2.add(70);
		list2.add('c'); // Adding a Object in ArrayList 
		list2.addAll(1,list1);
		System.out.println(list2);
		ArrayList list3=new ArrayList();
		list3.addAll(list1);
		System.out.println(list3.lastIndexOf("sara"));
		System.out.println(list3);
		list3.add("sara");
		System.out.println(list3);
		System.out.println(list3.lastIndexOf("sara"));
		System.out.println(list3.listIterator());
	}

}
