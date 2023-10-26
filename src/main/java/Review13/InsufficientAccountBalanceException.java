package Review13;

public class InsufficientAccountBalanceException extends RuntimeException{
    public InsufficientAccountBalanceException(String msg){
        super(msg);
    }
}
