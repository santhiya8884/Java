package collec_practice;

import java.util.ArrayList;

public class Array_List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//add method :
		ArrayList al=new ArrayList();
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
		al2.add('c');
		al2.addAll(1,al);
		System.out.println(al2);
		
	}

}
/* output :
[5, sara, true, 5.6, S]
[5, sara, new added, true, 5.6, S]
[70, 5, sara, new added, true, 5.6, S, c]
*/
