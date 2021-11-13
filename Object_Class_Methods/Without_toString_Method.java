package string_13_11_2021;

public class Without_toString_Method {
	String stuname;
	int mark1;
	public Without_toString_Method(String string, int i) {
		// TODO Auto-generated constructor stub
		this.stuname=string;
		this.mark1=i;
	}

	public Without_toString_Method() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Without_toString_Method sara=new Without_toString_Method();
		sara.pratice1();
	}

	public void pratice1() {
		// TODO Auto-generated method stub
		Without_toString_Method stu1=new Without_toString_Method("Santhiya",123);
		Without_toString_Method stu2=new Without_toString_Method("sara",178);
		System.out.println(stu1);
		System.out.println(stu2);
		stu1.details();
		stu2.details();
	}
	//write for the much code without using toString method..
	public void details() {
		// TODO Auto-generated method stub
		System.out.println(stuname+" "+mark1);
	}

}
/* output :
 string_13_11_2021.Without_toString_Method@7440e464
string_13_11_2021.Without_toString_Method@49476842
Santhiya 123
sara 178
*/
