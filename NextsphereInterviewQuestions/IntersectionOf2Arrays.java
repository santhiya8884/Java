package nextsphere;

public class IntersectionOf2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {1,3,5};
		int[] a2= {10,1,3,6,5,8};
		int[] c=new int[a1.length+a2.length];
		boolean flag=false;int pos=-1;
		int k=0;
		int count=0;
		for(int  i=0;i<a1.length;i++) { 
			
		
		for(int j=0;j<a2.length;j++) { 
			flag=false;
			if(a1[i]==a2[j]) { 
				flag=true;
				pos=j;
				//System.out.println(pos);
				
				
			}
			
			if(flag==true) { 
				//System.out.println(k+" "+pos);
				c[k]=a2[pos];
				k++;
				count++;
			}
			
			
		}
		
		}
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
			}
		System.out.println();
		for(int i=0;i<a2.length;i++) {
			System.out.print(a2[i]+" ");
			}
		System.out.println();
		System.out.println("Intersect of elemt");
		for(int i=0;i<count;i++) {
			//System.out.println("Intersect of elemt");
			System.out.print(c[i]+" ");
			}
		
		
	}

}
/*output :
1 3 5 
10 1 3 6 5 8 
Intersect of elemt
1 3 5 
 */
