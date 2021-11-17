package utility_classes;

import java.util.ArrayList;
import java.util.Collections;

public class NamewiseDecending {

		String brand;
		int ram;
		int price;
		public NamewiseDecending(String string, int i, int j) {
			// TODO Auto-generated constructor stub
			this.brand=string;
			this.ram=i;
			this.price=j;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			NamewiseDecending l1=new NamewiseDecending("Dell",4,40000);
			NamewiseDecending l2=new NamewiseDecending("Hp",4,45000);
			NamewiseDecending l3=new NamewiseDecending("Lenovo",4,50000);
			NamewiseDecending l4=new NamewiseDecending("Acer",4,30000);
			NamewiseDecending l5=new NamewiseDecending("Sony",4,10000);
			NamewiseDecending l6=new NamewiseDecending("Dell",4,40000);
			NamewiseDecending l7=new NamewiseDecending("Lenovo",4,25000);
			ArrayList al=new ArrayList();
			al.add(l1);
			al.add(l2);
			al.add(l3);
			al.add(l4);
			al.add(l5);
			al.add(l6);
			al.add(l7);
			System.out.println(al);
			System.out.println("brand name wise  DEcending order priting...");
			Compartor_Demo1 cd=new Compartor_Demo1();
			Collections.sort(al,cd);
			System.out.println(al);
		}

		

		@Override
		public String toString() {
			return ""+this.brand+" "+this.ram+" "+this.price;
		
	}


}
/* output :
[Dell 4 40000, Hp 4 45000, Lenovo 4 50000, Acer 4 30000, Sony 4 10000, Dell 4 40000, Lenovo 4 25000]
brand name wise  DEcending order priting...
[Sony 4 10000, Lenovo 4 50000, Lenovo 4 25000, Hp 4 45000, Dell 4 40000, Dell 4 40000, Acer 4 30000]

*/
