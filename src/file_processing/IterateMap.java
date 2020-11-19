package file_processing;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class IterateMap {

	public static void interate(String path , HashMap<Integer, String> theMap)
	{
		try {
			BufferedWriter bf = new BufferedWriter( new FileWriter(path));
			//iterating map values only
			for(Map.Entry<Integer, String> entry : theMap.entrySet())
			{
				bf.write(entry.getValue());
				 bf.newLine();
			}
			bf.flush();
			bf.close();
		}catch(IOException e){
            e.printStackTrace();
		}
	}
}
