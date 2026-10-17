package in.strikes.crudSpringBootDemo.exception;

public class ResourceNotFoundException extends GlobalExceptionHandling{
    public ResourceNotFoundException(String message){
        super(message);
    }
}
