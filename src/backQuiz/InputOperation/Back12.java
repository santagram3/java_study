package backQuiz.InputOperation;

import java.util.Scanner;

public class Back12 {
    public static void main(String[] args) {


        //  스캐너 api 사용
        Scanner sc = new Scanner(System.in); // 걍 외워라

        // 스캐너의 함수들

        // - next() : 문자열을 입력받을 때 , 공백은 처리불가 // 공백 전까지 받음  // 안녕 하세요 -> 안녕
        // - nextLine() : 문자열 입력 , 공백 포함 가능
        // - nextInt() : 정수를 입력
        // - nextDouble() : 실수를 입력


        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();



        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);

        sc.close();


    }
}
