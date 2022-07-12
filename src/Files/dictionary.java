package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class dictionary {
 public static void main(String[] args) throws IOException {
	 
	 doesFileExist();
	
}	
 public static void doesFileExist() throws IOException {
	File f =  new File("src\\dictionary.txt");
	String path =  "src\\dictionary.txt";
	
	if (f.exists()) {
		System.out.println("File exist");
	   System.out.println("Here is the dictionarry content: ");
	   
	   FileInputStream fi = new FileInputStream(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		String line;
		while( (line=br.readLine())!=null);
	}   
			
	else				
		System.out.println("File does not exist here, please find it somewhere else, Thank you");
	 
	{
	
	}
	
 }
	


}
