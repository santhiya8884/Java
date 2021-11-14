package collec_practice;

import java.util.LinkedList;

public class LinkedList_1_13_11_2021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1=new LinkedList();
		//append the element end of list
		list1.add(10);
		list1.add("santhiya");
		list1.add(true);
		System.out.println(list1);
		list1.add(1, "Ram");
		
		//size of the LinkedList
		System.out.println(list1.size());
		//insert specified element specified index
		System.out.println(list1);
		LinkedList list2=new LinkedList();
		System.out.println(list2);
		System.out.println(list2.size());
		//addAll 
		list2.addAll(list1);
		System.out.println(list2);
		LinkedList list3=new LinkedList();
		list3.add('c');
		list3.add(3.5f);
		//list3.addFirst("saranya");
		System.out.println(list3);
		//add First position
		list3.addFirst("saranya");
		System.out.println(list3);
		//addlast postion
		list3.addLast(list2);
		System.out.println(list3);
		LinkedList list4=new LinkedList();
		//empty list
		list3.add(1, list4);
		System.out.println(list3);
		
		
	}

}
/* output:
 [10, santhiya, true]
4
[10, Ram, santhiya, true]
[]
0
[10, Ram, santhiya, true]
[c, 3.5]
[saranya, c, 3.5]
[saranya, c, 3.5, [10, Ram, santhiya, true]]
[saranya, [], c, 3.5, [10, Ram, santhiya, true]]
*/
