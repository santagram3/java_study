package programers.level1;

import java.util.Scanner;

public class 짝수와_홀수 {

    public static String main(String[] args) {
//
//        정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

        Scanner sc = new Scanner(System.in);
        String b = "even";
        String c = "odd";
        int a = sc.nextInt();
        while (true) {
            if (a % 2 == 0) {
                return b;
            }
            else{
                return c;
            }

        }


    }
}
