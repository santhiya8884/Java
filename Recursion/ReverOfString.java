package recursion;

public class ReverOfString {
	static  String s1="hai";
	static  String s2="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2=reverse(s1,s1.length());
		System.out.println(s2);
	}
	private static String reverse(String s1, int length) {
		// TODO Auto-generated method stub
		s2=s2+s1.charAt(length-1);
		length--;
		if(length>0) { 
			reverse( s1,  length);
		}
		return s2;
	}

}
/* output :
iah
*/