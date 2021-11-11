package file_pratice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Methods {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("/home/sara/Documents/hhh.txt");
		File f1=new File("/home/sara/Documents/ABC.txt");
		f1.mkdir();
	
			boolean result=f.createNewFile();
			// System.out.println(result);
			FileWriter writer=new FileWriter(f,true);
		//	writer.write("Santhiya is a good girl");
			//writer.write("Hai evryone");
		//	writer.write("98765 54321 43");
		//	writer.write(115);
			writer.write("kkkkkk  \n 500 ");
			writer.write("\t");
			writer.write(900);  
			writer.flush();
			writer.close();
			
	}

}
