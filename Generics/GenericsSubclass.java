package generics_18_11_2021;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericsSubclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsSubclass sara = new GenericsSubclass();
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
		ArrayList<Float> al5 = new ArrayList<Float> ();
		al2.add(5.6);
		al2.add(8.1);
		al2.add(2.5);
		al2.add(7.5);
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("santhiya");
		al3.add("vino");
		sara.display(al5);
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
		//al.add(90);
		//al.add("san");
		//System.out.println(al);
		//al.add('c');

	}

}




/* ooutput :
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
The method display(ArrayList<Integer>) in the type GenericsSubclass is not applicable for the arguments (ArrayList<Float>)

at generics_18_11_2021.GenericsSubclass.main(GenericsSubclass.java:36)


*/