package day02;

import java.util.Scanner;

public class InputQuiz01 {
    public static void main(String[] args) {
        
        
        //  스캐너 api 사용
        Scanner sc = new Scanner(System.in); // 걍 외워라

        // 스캐너의 함수들

        // - next() : 문자열을 입력받을 때 , 공백은 처리불가 // 공백 전까지 받음  // 안녕 하세요 -> 안녕 
        // - nextLine() : 문자열 입력 , 공백 포함 가능
        // - nextInt() : 정수를 입력
        // - nextDouble() : 실수를 입력

        String name2 = sc.nextLine();

        System.out.println("name2  = " + name2);
    
        System.out.println("*****상품 재고 총액 구하기 ****");
        System.out.print("상품의 가격 : ");
        int number2 = sc.nextInt();
        System.out.print("상품의 수량 : ");
        int number = sc.nextInt();
        System.out.println("=======================================");
        System.out.println("- 상품 재고 총액 : " + number2*number);
    }
}
