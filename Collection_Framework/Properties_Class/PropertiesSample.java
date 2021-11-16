package map_pratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//used for the DB connections :
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("/home/sara/eclipse-workspace/Collection_Framework/src/map_pratice/Appliction.properties");
		p.load(fis);
		
		//System.out.println(p.getProperty("username"));
		///System.out.println(p.getProperty("password"));
		p.setProperty("pass", "sara");
		p.setProperty("vi", "ku");
		p.setProperty("to", "jaya");
		p.setProperty("DB", "MYSQL");
		//p.setProperty("password","santhiya");
	//	System.out.println(p.getProperty("password"));
		FileOutputStream fos=new FileOutputStream("/home/sara/eclipse-workspace/Collection_Framework/src/map_pratice/Appliction.properties");
		p.store(fos,"Added DB name ");
		
		
		Set s=p.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()) { 
			//S=(String)i.next();
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry);
			
		}
		
		
		
	}

}
