package file_pratice;

import java.io.IOException;
import java.util.Scanner;

public class File_Pratice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the input :");
		System.out.println("Print the output of the console "+"----Hai");
		System.err.println(" Print the error of the console "+"----------Warning ...");
		
		  try { int i=System.in.read(); 
		  System.out.println("get the input of the consol :"+(char)(i));
		  } 
		  catch (IOException e) { 
			  // TODO Auto-generated catch block 
			  e.printStackTrace(); 
			  }
		  
		 
		
		
		/*
		 * try { int result=System.in.read(); //byte result[]=System.in.readAllByte;
		 * System.out.println(result);
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
		
		
	}

}
/* output :
Print the output of the console ----Hai
 Print the error of the console ----------Warning ...
HAI
get the input of the consol :H
*/
