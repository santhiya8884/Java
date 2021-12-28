package recursion;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40,50};
		int start=0,end=array.length;
		int key=30;
		int result=bin(start,end,key,array);
		if(result==-1) { 
		System.out.println("not");
		}
		
		else 
		{
			System.out.println("prsent at loc"+result);
			
		}
	}

	private static int bin(int start, int end, int key, int[] array) {
		// TODO Auto-generated method stub
		int mid;
		if(start<end) { 
			mid=(start+end)/2;
			if(key==array[mid]) { 
				System.out.println("present");
				//break;
				return mid;
			}
			else if(key<array[mid]) { 
				end=mid-1;
			}
			else if(key>array[mid]) { 
				start=mid+1;
			}
			
			return  bin(start,end, key, array);
			
		}
		
		
		  
		
		return -1;
		
	}

}
/* output :
 
 present
prsent at loc2
*/
