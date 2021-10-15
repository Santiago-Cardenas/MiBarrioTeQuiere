package exceptions;

public class tiException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public tiException() {
		super("You have to be at least 18 years old to enter\n");
	}
}
