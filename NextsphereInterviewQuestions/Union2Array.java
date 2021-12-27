package nextsphere;

public class Union2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {10,40,70,30,20};
		int[] a2= {10,40,50,70,30,90};
		int[] c=new int[a1.length+a2.length];
		int  i=0;
		for(;i<a1.length;i++) { 
			c[i]=a1[i];
		}
		for(int j=0;j<a2.length;j++) { 
			c[i]=a2[j];
			i++;
		}
		for(int k=0;k<c.length;k++) { 
			System.out.print(c[k]+" ");
		}
		
	}

}
/*output :
 10 40 70 30 20 10 40 50 70 30 90 
 */
