package searching;

public class SearchBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40,50};
		int start=0,end=array.length-1;
		int mid;
		//System.out.println("Linear Search");
		int key=110;
		boolean flag=false;
		while(start<=end) {
			mid=(start+end)/2;
			if(key==array[mid]) {
				//int loc=mid;
				System.out.println("loc "+(mid+1));
				break;
			}
			else if(key<array[mid]) {
				end=mid-1;
			}
			else if(key>array[mid]) {
				start=mid+1;
			}

		}
		if(start>end) {
			System.out.println("The element not present in the array");
		}

	}

}
/* output :
The element not present in the array

 */
