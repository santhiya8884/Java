package collec_practice;

import java.util.ArrayList;

public class ArrayList_3 {

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
		System.out.println(list3);
		System.out.println(list3.equals(list3));
		System.out.println(list3.get(0));
		System.out.println(list3.getClass());
		System.out.println(list3.iterator());
		
	}

}
/* output :
[5, sara, true, 5.6, S]
[5, sara, new added, true, 5.6, S]
[70, 5, sara, new added, true, 5.6, S, c]
[5, sara, new added, true, 5.6, S]
true
5
class java.util.ArrayList
java.util.ArrayList$Itr@78308db1
*/
