package utility_classes;

import java.util.ArrayList;
import java.util.Collections;

public class LaptopDecendingOrder implements Comparable {

		String brand;
		int ram;
		int price;
		public LaptopDecendingOrder(String string, int i, int j) {
			// TODO Auto-generated constructor stub
			this.brand=string;
			this.ram=i;
			this.price=j;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LaptopDecendingOrder l1=new LaptopDecendingOrder("Dell",4,40000);
			LaptopDecendingOrder l2=new LaptopDecendingOrder("Hp",4,45000);
			LaptopDecendingOrder l3=new LaptopDecendingOrder("Lenovo",4,50000);
			LaptopDecendingOrder l4=new LaptopDecendingOrder("Acer",4,30000);
			LaptopDecendingOrder l5=new LaptopDecendingOrder("Sony",4,10000);
			LaptopDecendingOrder l6=new LaptopDecendingOrder("Dell",4,40000);
			LaptopDecendingOrder l7=new LaptopDecendingOrder("Lenovo",4,25000);
			ArrayList al=new ArrayList();
			al.add(l1);
			al.add(l2);
			al.add(l3);
			al.add(l4);
			al.add(l5);
			al.add(l6);
			al.add(l7);
			System.out.println(al);
			System.out.println("Pricewise decending order priting...");
			Collections.sort(al);
			System.out.println(al);
		}

		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			LaptopDecendingOrder v=(LaptopDecendingOrder)o;
			if(this.price>v.price) { 
				return -5;
			}
			else if(this.price<v.price){ 
				return 5;
			}
		
			else { 
				return 0; 
			}
		}

		@Override
		public String toString() {
			return ""+this.brand+" "+this.ram+" "+this.price;
		
	}

}
/* output :
[Dell 4 40000, Hp 4 45000, Lenovo 4 50000, Acer 4 30000, Sony 4 10000, Dell 4 40000, Lenovo 4 25000]
Pricewise decending order priting...
[Lenovo 4 50000, Hp 4 45000, Dell 4 40000, Dell 4 40000, Acer 4 30000, Lenovo 4 25000, Sony 4 10000]]
*/
