package utility_classes;

import java.util.ArrayList;
import java.util.Collections;

public class LaptopBrandOrder implements Comparable {


		String brand;
		int ram;
		int price;
		public LaptopBrandOrder(String string, int i, int j) {
			// TODO Auto-generated constructor stub
			this.brand=string;
			this.ram=i;
			this.price=j;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LaptopBrandOrder l1=new LaptopBrandOrder("Dell",4,40000);
			LaptopBrandOrder l2=new LaptopBrandOrder("Hp",4,45000);
			LaptopBrandOrder l3=new LaptopBrandOrder("Lenovo",4,50000);
			LaptopBrandOrder l4=new LaptopBrandOrder("Acer",4,30000);
			LaptopBrandOrder l5=new LaptopBrandOrder("Sony",4,10000);
			LaptopBrandOrder l6=new LaptopBrandOrder("Dell",4,40000);
			LaptopBrandOrder l7=new LaptopBrandOrder("Lenovo",4,25000);
			ArrayList al=new ArrayList();
			al.add(l1);
			al.add(l2);
			al.add(l3);
			al.add(l4);
			al.add(l5);
			al.add(l6);
			al.add(l7);
			System.out.println(al);
			System.out.println("--Brand order ascending lengthwise--");
			Collections.sort(al);
			System.out.println(al);
	
		}

		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			LaptopBrandOrder v=(LaptopBrandOrder)o;
			if(this.brand.length()>v.brand.length()) { 
				return 5;
			}
			else if(this.brand.length()<v.brand.length()){ 
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
/* output : brand oreder length()
[Dell 4 40000, Hp 4 45000, Lenovo 4 50000, Acer 4 30000, Sony 4 10000, Dell 4 40000, Lenovo 4 25000]
--Brand order ascending lengthwise--
[Hp 4 45000, Dell 4 40000, Acer 4 30000, Sony 4 10000, Dell 4 40000, Lenovo 4 50000, Lenovo 4 25000]
*/