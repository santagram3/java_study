package day15.exception;

public class Account {


    String owner ;
    int balance; // 잔액

    // 출금 기능
    public void withdraw(int money) throws BalanceInsufficientException{
        if (balance<money){
            // throw :  유발하다 , 발생하다  , 새로운 에러를 발생시킨다 .
            throw new BalanceInsufficientException("잔액부족 : 출금금액이 남은 잔액보다 많습니다. ");
//            throw new Exception("잔액부족 : 출금금액이 남은 잔액보다 많습니다. ");  이렇게 하게되면
//            throws Exception (int money) 옆에 붙여줘야한다

//            System.out.println(" 출금금액이 남은 잔액 보다 많습니다.");
//            return;
        }
        this.balance -= money;
    }


}
