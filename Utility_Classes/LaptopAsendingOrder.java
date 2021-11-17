package utility_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LaptopAsendingOrder implements Comparable {
	// prce vide ascending oreder....
	String brand;
	int ram;
	int price;
	public LaptopAsendingOrder(String string, int i, int j) {
		// TODO Auto-generated constructor stub
		this.brand=string;
		this.ram=i;
		this.price=j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaptopAsendingOrder l1=new LaptopAsendingOrder("Dell",4,40000);
		LaptopAsendingOrder l2=new LaptopAsendingOrder("Hp",4,45000);
		LaptopAsendingOrder l3=new LaptopAsendingOrder("Lenovo",4,50000);
		LaptopAsendingOrder l4=new LaptopAsendingOrder("Acer",4,30000);
		LaptopAsendingOrder l5=new LaptopAsendingOrder("Sony",4,10000);
		LaptopAsendingOrder l6=new LaptopAsendingOrder("Dell",4,40000);
		LaptopAsendingOrder l7=new LaptopAsendingOrder("Lenovo",4,25000);
		ArrayList al=new ArrayList();
		al.add(l1);
		al.add(l2);
		al.add(l3);
		al.add(l4);
		al.add(l5);
		al.add(l6);
		al.add(l7);
		System.out.println(al);
		System.out.println("--Pricewise ascending order using comparable interface and compareTo method--");
		Collections.sort(al);
		System.out.println(al);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		LaptopAsendingOrder v=(LaptopAsendingOrder)o;
		if(this.price>v.price) { 
			return 5;
		}
		else if(this.price<v.price){ 
			return -5;
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
--Pricewise ascending order using comparable interface and compareTo method--
[Sony 4 10000, Lenovo 4 25000, Acer 4 30000, Dell 4 40000, Dell 4 40000, Hp 4 45000, Lenovo 4 50000]


*/

