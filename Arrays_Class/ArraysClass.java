package map_pratice;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,10,80,70};
		for(int i=0;i<a.length;i++) { 
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i:a) { 
			System.out.print(i+" ");
		}
		System.out.println();
		String[] name= {"abc","jkl","res","gwe"};
		for(int i=0;i<name.length;i++) { 
			System.out.print(name[i]+" ");
		}
		
		System.out.println();
		System.out.println("		Before sorted....");
		for(String i:name) { 
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.sort(name);
		System.out.println("		After sorted....");
		for(String i:name) { 
			System.out.print(i+" ");
		}
		
	}

}
/* output 
 5 10 80 70 
5 10 80 70 
abc jkl res gwe 
		Before sorted....
abc jkl res gwe 
		After sorted....
abc gwe jkl res 
*/