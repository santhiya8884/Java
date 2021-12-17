package arrayPracticePayialagam;

import java.util.Scanner;

public class Array23{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array23 sara=new Array23();
		System.out.println("How many times particluar element present in the array :");
		sara.method1();
		
	}
	private void method1() {
		// TODO Auto-generated method stub
		int array[]= {10,20,10,80,60,20,40,60,70,30,40,50};//0,1,2,3,4,.............
		for(int i=0;i<array.length;i++) { 
			System.out.print(array[i]+" ");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("which element");
		int keyElement=sc.nextInt();
		int count=0;
		boolean flag=false;
		for(int i=0;i<array.length;i++) { 
			if(keyElement==array[i]) { 
				flag=true;
				count++;
			}
		}
		if(flag==true) { 
			System.out.println("the element "+keyElement+" present "+count+" times");
		}
		else { 
			System.out.println("the element not present");
		}
		
}
	
}
/* output :
How many times particluar element present in the array :
10 20 10 80 60 20 40 60 70 30 40 50 
which element
40
the element 40 present 2 times

*/