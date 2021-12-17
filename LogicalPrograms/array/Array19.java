package arrayPracticePayialagam;

public class Array19{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {-10,-20,30,-40,-90,-90,-4};
		int array1[]=new int[array.length];
		//int max=0;
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<array1.length;i++) { 
			if(max<array[i]) { 
				secMax=max;
				max=array[i];
			}
			else if(secMax<array[i]&&max!=array[i]) { 
				secMax=array[i];
			}
		}
		System.out.println(max);
		System.out.println(secMax);
		
	}

}
/* output :
30
-4
*/