package string_13_11_2021;

public class With_toString_Method {
	String stuname;
	int mark1;
	public With_toString_Method(String string, int i) {
		// TODO Auto-generated constructor stub
		this.stuname=string;
		this.mark1=i;
	}
	public String toString() {
		return this.stuname+" "+this.mark1; 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//toString method overriden easily to print the object details :
		With_toString_Method stu1=new With_toString_Method("Santhiya",123);
		With_toString_Method stu2=new With_toString_Method("sara",178);
		System.out.println(stu1);
		System.out.println(stu2);
		//stu1.details();
		//stu2.details();
	}

	public void details() {
		// TODO Auto-generated method stub
		
	}

}
/* output :
 Santhiya 123
sara 178
*/
