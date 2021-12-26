package clarityTravalSolutions;

public class TrimMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="    santhiya welcome to home    ";
		//String result=trim(s);
		String s2="";
		//System.out.println(result);
		int i=0;
		int las=0;
		int length=0;
		for(int k=0;k<s.length();k++) { 
			if(s.charAt(k)!= ' ') { 
				//System.out.print(k+" ");
				length++;
				las=k;
			}
			
		}
		System.out.println(length);
	//	System.out.println(las);
		while(i<s.length()) { 
			if(s.charAt(i)!=' ') {
				s2=s2+s.charAt(i);
				
				if(s.charAt(i+1)==' '&&(i+1)!=las+1) { 
					//System.out.println(i+1);
						s2=s2+s.charAt(i+1);
				}
					
					
					
				
			} 
			i++;
		}
		System.out.println(s2);
		System.out.println(s2.length());
	}

	private static String trim(String s) {
		// TODO Auto-generated method stub
		/*
		 * String s1=""; char ch[]=s.toCharArray(); int i=0; while() { if(s.charAt(i)!='
		 * ') { int start=i; } else if() {
		 * 
		 * } i++; } 
		 */
		return null;
		 
	}

}
/* output :
 
 21
santhiya welcome to home
24
*/
