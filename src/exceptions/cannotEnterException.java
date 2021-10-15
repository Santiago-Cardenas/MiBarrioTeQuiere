package exceptions;

public class cannotEnterException extends Exception{
    private static final long serialVersionUID = 1L;

    public cannotEnterException(){
        super("You cannot be registered\n"
        		+ "Please Remeber that you wont be able to register if the penultimate number of your ID number is even and the current day of the month is odd, and vice versa \n");
    }
}
