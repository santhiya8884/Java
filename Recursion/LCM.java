package recursion;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=5,no2=3;
		int greater=no1>no2?no1:no2;
		//System.out.println(greater);
		
		  int result=LCM(no1,no2,greater); System.out.println(result);
		 

			
		
		
	}

	private static int LCM(int no1, int no2, int greater) {
		// TODO Auto-generated method stub
		
		if((no1>1)&&(no2>1)) { 
			if((greater%no1==0)&& greater%no2	==0){ 
				return greater;
			}
			else { 
				return LCM(no1, no2, greater+1);
			}
		}
		
		  else { return -1; }
		 
		
}

}
/*output :
	15

*/	
