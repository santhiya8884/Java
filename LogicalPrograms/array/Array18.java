package arrayPracticePayialagam;

public class Array18{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {-10,-20,30,-40,-90,-90,-4};
		int array1[]=new int[array.length];
		//int max=0;
		int min=Integer.MAX_VALUE;
		int secMin=Integer.MAX_VALUE;
		for(int i=0;i<array1.length;i++) { 
			if(min>array[i]) { 
				secMin=min;
				min=array[i];
			}
			else if(secMin>array[i]&&min!=array[i]) { 
				secMin=array[i];
			}
		}
		System.out.println(min);
		System.out.println(secMin);
		
	}

}
/* output :
-90
-40
*/