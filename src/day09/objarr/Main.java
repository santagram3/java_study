package day09.objarr;

public class Main {

    public static void main(String[] args) {

        // 은행 생성
        Bank shinhan = new Bank("신한", 10);
        Bank gookmin = new Bank("국민", 5);
        Bank woori = new Bank("우리", 20);


        //사람 생성
        Person park = new Person("박영희");
        Person kim = new Person("김철수");
        park.money = 100000;
        kim.money = 5000;
        // 계좌생성
        park.makeAccount(shinhan);
        kim.makeAccount(woori);
        
        kim.makeAccount(shinhan);

        // 입금
        park.deposit(80000);
        kim.deposit(10000);

        shinhan.showAccounts();
        woori.showAccounts();
        gookmin.showAccounts();

        park.sendMoney(kim , 50000);



     }
}
