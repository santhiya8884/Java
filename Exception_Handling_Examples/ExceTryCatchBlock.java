package exception_practice;

public class ExceTryCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceTryCatchBlock sara=new ExceTryCatchBlock();
		try { 
			sara.goSathyaMarraigeFunction();
		}
		catch(Exception  e)  
		{
		System.out.println("some error");	
		}
		
		}
	

	public void goSathyaMarraigeFunction() {
		// TODO Auto-generated method stub
		
	}

}
/* output :
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
Syntax error, insert "Finally" to complete TryStatement

at exception_practice.ExceTryCatchBlock.main(ExceTryCatchBlock.java:10)
*/