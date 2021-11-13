package string_13_11_2021;

public class String_toString_Method_13_11_2021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_toString_Method_13_11_2021 sara=new String_toString_Method_13_11_2021();
		sara.methodtoString();
	}

	public void methodtoString() {
		// TODO Auto-generated method stub
		/* every print internally called to toString method...*/
		String_toString_Method_13_11_2021 ss=new String_toString_Method_13_11_2021();
		System.out.println(ss);
		System.out.println(ss.hashCode());
		// String object   
		/* toString overriden for the String Class*/
		String s1=new String("santhiya");
		System.out.println(s1.hashCode());
		System.out.println(s1);
		// hashcode overidden for the
		String s2=new String("santhiya");
		System.out.println(s2.hashCode());
		System.out.println(s2);

	}

}
/* output :
 1950409828
1950409828
string_13_11_2021.String_toString_Pratice@7440e464
string_13_11_2021.String_toString_Pratice@7440e464
vani
*/
