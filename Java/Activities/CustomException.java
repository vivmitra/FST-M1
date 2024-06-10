package Test;

public class CustomException extends Exception{

    private String message = null;

    CustomException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
