package file_pratice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("/home/sara/Documents/File/FirstDirectory/two.txt");
		BufferedReader bufreader=new BufferedReader(reader);
		/*
		 * int value=bufreader.read(); while(value!=-1) {
		 * System.out.println((char)value); value=bufreader.read(); }
		 */
		String result=bufreader.readLine();
		while(!result.equals(null)) { 
			System.out.println(result);
			result=bufreader.readLine();
		}
		bufreader.close();
		reader.close();
		
		
		
	}

}
