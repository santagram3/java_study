package day09.objarr;


// 사람 정보
public class Person {

    String name;  // 이름
    int money ; // 현재 소유한 현금

    // 통장 정보 - 통장은 1개만 소유할수 있다 가정
    Account myAccount ;

    // 생성자
    Person(String name){
        this.name = name;
        this.money = 0;
        this.myAccount = null;
    }

    void makeAccount(Bank bank) {
        // 신규 계좌 생성
         this.myAccount = new Account(this);
         // 내 정보 전체를 넘겨줘야 되서 this. 머시기가 아니고 그냥 통째로 this 로 만들면된다

        //신규 계좌의 은행명 필드 초기화
        myAccount.bankName = bank.bankName;
        // 실제 은행의 이름을 -- 내 계좌 은행이름에 넣는다
        // 은행에 계좌정보 등록
        bank.registry(myAccount);
        System.out.printf("%s은행에 %s님의 계좌가 신설되었습니다.\n",bank.bankName ,this.name);

    }

    void deposit(int depositMoney) {
        if (depositMoney <= money){
            // 내 통장 잔액
            myAccount.balance += depositMoney;
            // 내 현금 감소
            this.money -= depositMoney;
            System.out.printf("%s은행 계좌에 %d원이 입금되었습니다.\n",myAccount.bankName ,depositMoney);
        }
        else {
            System.out.printf("입금 실패! 소지금이 %d원 더 필요합니다.\n",depositMoney-money);
        }

    }

    void sendMoney(Person target,int money){
        //돈 받을 사람 , 얼마 보낼지
        if(this.myAccount.balance >= money) {
            // 내 계좌안에 .돈이 >> 이체액보다 커야 보낼수있음

            // 상대방의 예금잔액이 이체액 만큼 증가
            target.myAccount.balance +=money;
            // 나의 예금잔액이 이체액만큼 감소
            this.myAccount.balance -=money;
            System.out.printf("%s님이 %s님이게 %d원을 송금했습니다\n"
            ,this.name ,target.name , money);
        }
        else {
            System.out.printf("계좌 이체 실패 - 잔액 부족 !");
        }

    }

    // 잔액 조회 기능

    void checkBalance(){
        System.out.printf("%s님의 현재 예금 잔액은 %d원입니다.\n",this.name ,this.myAccount.balance);
    }





}
