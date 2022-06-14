package day15.exception;

import day08.modi.pac1.A;

public class AccMain {

    public static void main(String[] args) {

        Account acc= new Account();
        try {
            acc.withdraw(10000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
