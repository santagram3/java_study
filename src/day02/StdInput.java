package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdInput {
    public static void main(String[] args) throws IOException {

//        int inputData = System.in.read();
//        System.out.println(inputData);

        //  스캐너 api 사용
        Scanner sc = new Scanner(System.in); // 걍 외워라

        // 스캐너의 함수들

        // - next() : 문자열을 입력받을 때 , 공백은 처리불가 // 공백 전까지 받음  // 안녕 하세요 -> 안녕 
        // - nextLine() : 문자열 입력 , 공백 포함 가능
        // - nextInt() : 정수를 입력
        // - nextDouble() : 실수를 입력


//        String name = sc.next();
//        System.out.println("name = " + name);

        System.out.print("이름 : ");
        String name2 = sc.nextLine();
        System.out.println("name2  = " + name2);

        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.println("age + 10 = " + (age + 10));

        // 스캐너 메모리 해제

        sc.close();


    }
}
