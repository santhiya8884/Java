package file_pratice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("/home/sara/Documents/File/FirstDirectory/");
		boolean resultdir=file.mkdir();
		
		//File file1=new File("/home/sara/Documents/File/FirstDirectory/one.txt");//file object
		//boolean result=file1.createNewFile();
		/*
		 * System.out.println("create a Dir "+resultdir);
		 * System.out.println("create a File "+result);
		 */
		FileWriter writer=new FileWriter("/home/sara/Documents/File/FirstDirectory/one.txt");//String path
		//FileWriter writer=new FileWriter(file1);
		writer.write("Heavy rain today \n");
		writer.write("pratice \n ");
		writer.write(105  );// 100 cooresponding ascci code printed
		writer.write("\n" +100 + "%");
		writer.append("Exsting content and new conten added... \n ");
		writer.append("Using string path..");
		writer.flush();
		writer.close();

		}

}
