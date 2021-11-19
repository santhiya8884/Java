package generics_18_11_2021;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericsPassedToaArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsPassedToaArgument sara = new GenericsPassedToaArgument();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(50);
		al.add(20);
		al.add(60);
		// al.add('c');
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Santhiya", 25);
		hm.put("Rani", 27);
		hm.put("Sara", 25);
		hm.put("Vino", 28);
		// hm.put(28, true);
		ArrayList al2 = new ArrayList();
		al2.add(10);
		al2.add("santhiya");
		al2.add(20);
		al2.add("vino");
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("santhiya");
		al3.add("vino");
		
		sara.display(al);
		sara.display(al2);
		//sara.display(al3);//error
		ArrayList al4 = new ArrayList();
		al4.add("santhiya");
		al4.add("vino");

	}

	private void display(ArrayList<Integer> al) {
		// TODO Auto-generated method stub
		System.out.println(al);
		/*
		 * ArrayList am=new ArrayList(); am.addAll(al);
		 * 
		 * System.out.println(am);
		 */
		al.add(90);
		//al.add("san");
		System.out.println(al);
		//al.add('c');

	}

}
/* output :rule :---pratices
 
 
 
 [10, 50, 20, 60]
[10, 50, 20, 60, 90]
[10, santhiya, 20, vino]
[10, santhiya, 20, vino, 90]


*/
