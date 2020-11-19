package file_processing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class CreatingHashMap{

	public static HashMap createMap (String path) throws OneLineException
	{
		HashMap<Integer, String> textInput = new HashMap<Integer, String>();
		
		try {
			System.out.println("Now reading the file: ");
			BufferedReader br = new BufferedReader(new FileReader(path));
			String s;
			int count = 0;
			
			while((s = br.readLine()) != null)
			{
				count++;
				textInput.put(count, s);
			}
			br.close();
			
			if(count < 2)
			{
				throw new OneLineException();
			}
		}
		catch(Exception e) 
		{
			 System.out.println("An error occurred creating a map");
			 e.printStackTrace();
		}
		return textInput;
	}
}
