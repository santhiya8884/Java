package arrayPracticePayialagam;

public class Array11{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40};
		int array1[]=new int[array.length];
		for(int i=0;i<array1.length;i++) { 
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		int j=array.length-1;
		for(int i=0;i<array.length;i++) { 
			array1[i]=array[j];
			j--;
		}
		for(int i=0;i<array1.length;i++) { 
			System.out.print(array1[i]+" ");
		}
	}

}
/* output :
0 0 0 0 
40 30 20 10 
*/