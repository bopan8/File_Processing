package file_processing;

public class OneLineException extends Exception {

	@Override
	public String getMessage() {
		return "You have only one line in the file and you can`t do switching";
	} 
}
