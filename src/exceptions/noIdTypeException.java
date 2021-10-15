package exceptions;

public class noIdTypeException extends Exception{
    private static final long serialVersionUID = 1L;

    public noIdTypeException(){
        super("Please enter a valid ID type");
    }
}
