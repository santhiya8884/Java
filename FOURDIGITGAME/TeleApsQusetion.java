package program_18_11_2021;

public class TeleApsQusetion {
	static int i=1;
	static int a;
	static float b;
	static char c;
	static String d;
	static short e;
	static long f;
	static double g;
	static boolean p;

	public static void main(String[] args) { //1. Can we override a man method?
		// TODO Auto-generated method stub
TeleApsQusetion sara=new TeleApsQusetion();
//sara.Question2();
//sara.Question3();
//sara.Question4();
//sara.Question6();
//sara.Question7();
//sara.Question8();
//sara.Question9();
//sara.Question10();
//sara.Question18();
//sara.Question19();////////////////////doubt
sara.Question20();
	}

	public void Question20() {
		// TODO Auto-generated method stub
		System.out.println(-4+1/2+2*-3+5.0);
	}

	public void Question19() {
		// TODO Auto-generated method stub
		TeleApsQusetion  r1=new TeleApsQusetion();
		r1.setColor(Color.blue);
		TeleApsQusetion  r2=r1;
		r1.setColor(Color.red);
	}

	public void Question18() {
		// TODO Auto-generated method stub
		String s="0";
		String s1="ab"+"cd";
		//String s3='c';
		
	}

	public void Question10() {
		// TODO Auto-generated method stub
		System.out.print(i+",");
		m(i);
		System.out.print(i);
	}

	public void m(int i2) {
		// TODO Auto-generated method stub
		i+=2;
	}

	public void Question9() {
		// TODO Auto-generated method stub
		int i=0;
		i=i++ +i;
		System.out.println(i);
	}

	public void Question8() {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(p);
		
	}

	public void Question7() {
		// TODO Auto-generated method stub
		String x=null;
		//giveMeAString(x);
		System.out.println(x);
	}

	
	/*
	 * static void giveMeAString(String y) { // TODO Auto-generated method stub
	 * y="Hello"; x=y; }
	 * 
	 */
	public void Question5() {
		// TODO Auto-generated method stub
		System.out.println(fun());
	}
	int fun() { 
		return 20;
	}

	public void Question4() {
		// TODO Auto-generated method stub
		System.out.println(10*20+"Helloworld");
		System.out.println("Helloworld"+10*20);
	}

	public void Question3() {
		// TODO Auto-generated method stub
		System.out.println(10+20+"HElloworld");
		System.out.println("HElloworld"+10+20);
	}

	public void Question2() {
		// TODO Auto-generated method stub
		int x=-4;
		System.out.println(x>>2);
		int y=4;
		System.out.println(y>>2);
		
	}

}
