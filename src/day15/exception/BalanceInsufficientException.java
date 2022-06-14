package day15.exception;

// 잔액부족이라는 에러 , 상속받는다 , 익셉션 ,
public class BalanceInsufficientException extends Exception {

    public BalanceInsufficientException(){
    }
    public BalanceInsufficientException(String message) {
        super(message);
    }

}
