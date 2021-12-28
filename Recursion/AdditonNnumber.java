package recursion;

public class AdditonNnumber {
	static int sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=add(1);
System.out.println(result);
	}
	
	private static int add(int i) {
		// TODO Auto-generated method stub
		if(i<=5) { 
			sum=sum+i;
			//System.out.println(sum);
			i++;
			add(i);
			
		}
		return sum;
		
	}
}
/* output :
15
*/