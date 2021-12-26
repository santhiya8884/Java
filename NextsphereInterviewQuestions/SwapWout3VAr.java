package nextsphere;

public class SwapWout3VAr {
public static void main(String[] args) {
	int a=10,b=4;
	System.out.println("Before Swapping");
	System.out.println(a+" "+b);
	System.out.println("After Swapping");
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a+" "+b);
}

}
/* output :
Before Swapping
10 4
After Swapping
4 10
*/