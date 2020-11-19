package file_processing;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class SwitchingWords {

	public static void switchingWords(HashMap map, String path) throws IOException, LinesOutOfBoundriesException, WordsOutOfBoundriesException {
		System.out.println("Enter from which lines you want to change words from");
		Scanner n = new Scanner(System.in);
		int lineOne = n.nextInt();
		int lineTwo = n.nextInt();
		System.out.println("The first word: ");
		int wordOne = n.nextInt();
		System.out.println("The second word: ");
		int wordTwo = n.nextInt();
		if((lineOne < 0 || lineTwo < 0) || (lineOne > map.size() || lineTwo > map.size()))
		{
			throw new LinesOutOfBoundriesException();
		}
		if(lineOne < map.size() || lineTwo < map.size()) {
			
			//zapisvane na redovete kato string
			String firstLine = (String) map.get(lineOne);
			String secondLine = (String) map.get(lineTwo);
			//spliting strings
			String[] splittedFirstLine = firstLine.split("\\s+");
			String[] splittedSecondLine = secondLine.split("\\s+");
			
			if((wordOne < 0 || wordTwo < 0) || (wordOne > splittedFirstLine.length || wordTwo > splittedSecondLine.length)){
				throw new WordsOutOfBoundriesException();
			}
			
			else
			{
				System.out.println("The first word you chose: ");
				System.out.println(splittedFirstLine[wordOne-1]);
				System.out.println("The second word you chose: ");
				System.out.println(splittedSecondLine[wordTwo-1]);
				String temp = null;
				//switching places of words
				temp = splittedFirstLine[wordOne-1];
				splittedFirstLine[wordOne-1] = splittedSecondLine[wordTwo-1];
				splittedSecondLine[wordTwo-1] = temp;
				
				System.out.println("Switched: ");
				System.out.println("The first word: ");
				System.out.println(splittedFirstLine[wordOne-1]);
				System.out.println("The second word: ");
				System.out.println(splittedSecondLine[wordTwo-1]);
				
				//convert array to string again
				String one = String.join(" ", splittedFirstLine);
				String two = String.join(" ", splittedSecondLine);
				System.out.println("The new line one : " + one);
				System.out.println("The new line two : " + two);
				map.put(lineOne, one);
				map.put(lineTwo, two);
				
				//deleting everything from the file
				I_O.deleteTextFromFile(path);
				//overwriting the file
				IterateMap.interate(path, map);
			}
		}
		
	}
}
