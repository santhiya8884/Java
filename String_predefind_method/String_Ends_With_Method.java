package string_practice;

public class String_Ends_With_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Santhiya";
		System.out.println(s.endsWith("A"));
		System.out.println(s.endsWith("a"));
		System.out.println(s.endsWith("ya"));
		System.out.println(s.endsWith("SA"));
		System.out.println(s.endsWith("s"));
		System.out.println(s.endsWith("Az"));
	}

}
/* output :
false
true
true
false
false
false
*/