package file_processing;

public class LinesOutOfBoundriesException extends Exception{
	
	@Override
	public String getMessage() {
		return "The line you want  to switch does not exist";
	} 

}
