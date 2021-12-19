package searching;

public class SearchLinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,40,50,60,29,7,45};
		System.out.println("Linear Search");
		int key=100,loc=-1;
		boolean flag=false;
		for(int i=0;i<array.length;i++) { 
			if(key==array[i]) { 
				loc=i+1;
				flag=true;
				break;
			}
			
		}
		if(flag==true&&loc>0) { 
			System.out.println("present at location "+loc);
		}
		else {
			System.out.println("not present");
		}
	}

}
/* output :
 not present
 */
