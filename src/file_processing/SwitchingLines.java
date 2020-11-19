package file_processing;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class SwitchingLines {

	public static void switchLines(HashMap map, String path) throws IOException, LinesOutOfBoundriesException
	{
			System.out.println("Enter which lines you want to switch");
			Scanner n = new Scanner(System.in);
			int lineOne = n.nextInt();
			int lineTwo = n.nextInt();
			if((lineOne < 0 || lineTwo < 0) || (lineOne > map.size() || lineTwo > map.size()))
			{
				throw new LinesOutOfBoundriesException();
			}
			if(lineOne < map.size() || lineTwo < map.size()) {
				System.out.println("Before switching: ");
				System.out.println(map.get(lineOne));
				System.out.println(map.get(lineTwo));
				
				String line1 = (String) map.get(lineOne);
				String line2 = (String) map.get(lineTwo);
				String temp=null;
				temp = line1;
				line1=line2;
				line2= temp;
				map.put(lineOne, line1);
				map.put(lineTwo, line2);
				System.out.println("Switched: ");
				System.out.println(map.get(lineOne));
				System.out.println(map.get(lineTwo));
				
				//deleting everything from the file
				I_O.deleteTextFromFile(path);
				//overwriting the file
				IterateMap.interate(path, map);
			}
	}
}
