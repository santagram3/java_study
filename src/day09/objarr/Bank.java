package day09.objarr;

import day08.modi.pac1.A;

public class Bank {

    String bankName ; // 은행명

    // 등록된 계좌들
    Account[] accounts; // 어카운트 배열

    // 총 보유 액수
    int totalCash;

    // 등록된 계좌 수
    int accountCount;

    // 생성자
    Bank(String bankName, int accountCount) {
        this.bankName = bankName;
        this.accountCount = 0;
        this.accounts = new Account[accountCount];

    }

    // 신규 계좌 등록 기능
    void registry (Account newAccount){
        // 등록 가능한지 여부 : 총 계좌 등록 제한 개수를 넘지 않았는가 ?
        if (accountCount < accounts.length){
            accounts[accountCount++]= newAccount;
            System.out.println("신규 계좌가 등록 되었습니다.");
        }
        else {
            System.out.println(" 더이상 계좌를 등록할수 없습니다.");
            return;
        }
    }
    // 등록된 모든 계좌 조회 기능
    void showAccounts(){
        System.out.printf("========[%s은행] 등록계좌 (총 %d)=======\n",
                this.bankName,this.accountCount);
        for (int i = 0; i <this.accountCount; i++) {
            // # 1. 홍길동님 계좌 - 잔액 [10000원]
            System.out.printf("#%d %s님 계좌 - 잔액[%d] ",i+1 ,accounts[i].owner.name, accounts[i].balance);

            /*
                accounts[0] - 첫번째 계좌 정보
                accounts[0].balance  - 첫번째 계좌의 잔액정보
                accounts[0].owner - 첫번째 계좌의 예금주의 모든정보
                accounts[0].owner.name - 첫번째 계좌의 예금주의 이름

            */


        }
    }



}
