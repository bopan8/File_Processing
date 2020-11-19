package file_processing;

public class WordsOutOfBoundriesException extends Exception{
	
	@Override
	public String getMessage() {
		return "The word you want  to switch does not exist";
	} 
}
