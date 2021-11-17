package utility_classes;

import java.util.ArrayList;
import java.util.Collections;

public class LaptopNamewise  extends CompartorDemo{

		String brand;
		int ram;
		int price;
		public LaptopNamewise(String string, int i, int j) {
			// TODO Auto-generated constructor stub
			this.brand=string;
			this.ram=i;
			this.price=j;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LaptopNamewise l1=new LaptopNamewise("Dell",4,40000);
			LaptopNamewise l2=new LaptopNamewise("Hp",4,45000);
			LaptopNamewise l3=new LaptopNamewise("Lenovo",4,50000);
			LaptopNamewise l4=new LaptopNamewise("Acer",4,30000);
			LaptopNamewise l5=new LaptopNamewise("Sony",4,10000);
			LaptopNamewise l6=new LaptopNamewise("Dell",4,40000);
			LaptopNamewise l7=new LaptopNamewise("Lenovo",4,25000);
			ArrayList al=new ArrayList();
			al.add(l1);
			al.add(l2);
			al.add(l3);
			al.add(l4);
			al.add(l5);
			al.add(l6);
			al.add(l7);
			System.out.println(al);
			System.out.println("brand name wise  Ascending order priting...");
			CompartorDemo cd=new CompartorDemo();
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
Pricewise decending order priting...
[Acer 4 30000, Dell 4 40000, Dell 4 40000, Hp 4 45000, Lenovo 4 50000, Lenovo 4 25000, Sony 4 10000]
*/
