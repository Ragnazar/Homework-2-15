package pro.sky.exceptions;

public class ElementAlreadyExistsException extends RuntimeException{
    public ElementAlreadyExistsException(String message){
        super(message);
    }
}
