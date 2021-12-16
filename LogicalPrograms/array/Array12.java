package arrayPracticePayialagam;

public class Array12{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,-20,30,-40,90,-4};
		int array1[]=new int[array.length];
		for(int i=0;i<array1.length;i++) { 
			if(array[i]<0) { 
				System.out.print(array[i]+" ");
			}
		}
		
	}

}
/* output :
-20 -40 -4 
*/