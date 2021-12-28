package recursion;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=11,no2=15;
		int small=no1<no2?no1:no2;
		int result=GCD(no1,no2,small); 
		System.out.println(result);
		 
		
		
	}

	private static int GCD(int no1, int no2, int small) {
		// TODO Auto-generated method stub
		
		if(small>1) { 
			if((no1%small==0)&& no2%small==0){ 
				return small;
			}
			else { 
				return GCD(no1, no2, small-1);
			}
		}
		else  
		{ 
			return -1;
		}
		
}

}
/*output :
	-1
*/	
