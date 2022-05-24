package day05;

import java.util.Scanner;

public class ScannerProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.printf("정수 :");
        int n = sc.nextInt();

        // 잔여공백을 처리하고 넘어가야함
        sc.nextLine();

        System.out.printf("문자열 :");
        String s = sc.nextLine();

        System.out.println("s :" +s);
        sc.close();
        // 오류생김

        // next , nextInt , nextDouble , 쓰면 기본적으로 \n이 남아있기때문에
//        sc.nextLine(); // 로 \n 을 받아주고 다음을 받아주면된다
    }
}
