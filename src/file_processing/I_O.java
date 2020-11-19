package file_processing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File; 
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class I_O {

	public static void createFileCheck(String path)
	{
		try {
		      File myObj = new File(path);
		      if (myObj.createNewFile())
		      {
		        System.out.println("File created: " + myObj.getName());
		      }
		      else 
		      {
		        System.out.println("File already exists.");
		      }
		    } 
		catch (IOException e) 
			{
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	public static void writeFile(String path)
	{
		try {
			System.out.println("Now write what you want in the file: ");
			BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			Scanner i = new Scanner(System.in);
			String input = i.nextLine();
			bw.write(input);
			bw.close();
			System.out.println("Successfully wrote to the file.");
		}
		catch(Exception e) 
		{
			 System.out.println("An error occurred.");
			 e.printStackTrace();
		}
	}
	
	public static void readFile(String path)

	{
		try {
			System.out.println("Now reading the file: ");
			BufferedReader br = new BufferedReader(new FileReader(path));
			String s;
			
			while((s = br.readLine()) != null)
			{
				System.out.println(s);
			}
			br.close();
		}
		catch(Exception e) 
		{
			 System.out.println("An error occurred.");
			 e.printStackTrace();
		}
	}

	public static void deleteTextFromFile(String path) throws IOException {
		 new FileWriter (path,false).close();
	}
}
