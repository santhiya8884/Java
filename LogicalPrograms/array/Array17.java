package arrayPracticePayialagam;

public class Array17{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {-10,-20,30,-40,-90,-4};
		int sum=0;
		for(int i=1;i<array.length;i=i+2) { 
			
				sum=sum+array[i];
			
		}
		System.out.println(sum);
		
		
	}

}
/* output :
-64

*/