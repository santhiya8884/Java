package arrayPracticePayialagam;

import java.util.Scanner;

public class Array21{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array21 sara=new Array21();
		System.out.println("Remove element in array :");
		sara.method1();
		
	}
	private void method1() {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40,50};//0,1,2,3,4,.............
		for(int i=0;i<array.length;i++) { 
			System.out.print(array[i]+" ");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("which number to delete");
		int removeElement=sc.nextInt();
		boolean flag=false;
		int copyArray[]=new int[array.length-1];
				for(int i=0;i<array.length;i++) { 
			if(removeElement==array[i])
			{ 
				flag=true;
				int position=i;//2
				
				
				for(int j=0;j<array.length;j++) { //2
					if(j<position) { 
						copyArray[j]=array[j];
					}
					else if(j>position) { 
						copyArray[j-1]=array[j];
					}
				}
				
				
			}
			
			
		}
				if(flag==false) {
					
						System.out.println("element not present");
					
				}
				else { 
					for(int i=0;i<copyArray.length;i++) { 
						System.out.print(copyArray[i]+" ");
					}
				}
		
		
		

		
	}
	
}
/* output :
Remove element in array :
10 20 30 40 50 
which number to delete
30
10 20 40 50 

*/