package arrayPracticePayialagam;

public class Array15{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {-10,-20,30,-40,-90,-4};
		int array1[]=new int[array.length];
		//int max=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<array1.length;i++) { 
			if(max<array[i]) { 
				max=array[i];
			}
		}
		System.out.println(max);
		
	}

}
/* output :
30
*/