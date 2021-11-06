package string_practice;

public class String_Last_IndexOf_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Santhiya";
		System.out.println(s.lastIndexOf(0));
		System.out.println(s.lastIndexOf("S"));
		System.out.println(s.lastIndexOf("s"));
		System.out.println(s.lastIndexOf("San"));
		System.out.println(s.lastIndexOf("z"));
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.lastIndexOf("iya"));
	}

}
/* output :-1
0
-1
0
-1
7
5
*/