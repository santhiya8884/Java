package arrayPracticePayialagam;

public class Array16{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {-10,-20,30,-40,-90,-4};
		int array1[]=new int[array.length];
		//int max=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<array1.length;i++) { 
			if(min>array[i]) { 
				min=array[i];
			}
		}
		System.out.println(min);
		
	}

}
/* output :
-90
*/