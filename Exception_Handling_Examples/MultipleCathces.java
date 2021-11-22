package exception_practice;

public class MultipleCathces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleCathces sara=new MultipleCathces();
		try { 
			sara.goSathyaMarraigeFunction();
		}
		catch(bikeproblem  e)  
		{
		System.out.println("some error");	
		}
		catch(rain  e)  
		{
		System.out.println("some error");	
		}
		catch(trafic  e)  
		{
		System.out.println("some error");	
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