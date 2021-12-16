package arrayPracticePayialagam;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40,50,20,50,30,20};
		int temp,j=array.length-1,key=20,count=0;
		for(int i=0;i<array.length;i++) { 
			if(array[i]==20) { 
				count++;
			}
		}
		if(count>0) { 
			System.out.print("Present "+count+" times");
		}
		else { 
			System.out.print("not present");
		}
		System.out.println();
		
		
	}

}
/* output :
Present 3 times

*/