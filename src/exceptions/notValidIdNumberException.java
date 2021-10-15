package exceptions;

public class notValidIdNumberException extends Exception{
    private static final long serialVersionUID = 1L;

    public notValidIdNumberException(){
        super("Please enter a valid ID number");
    }
}
