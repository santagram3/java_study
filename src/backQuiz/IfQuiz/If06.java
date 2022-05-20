package backQuiz.IfQuiz;

import java.util.Scanner;

public class If06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 시간
        int b = sc.nextInt(); // 현재 분
        int c = sc.nextInt(); // 걸리는 분

        int P = b + c;
        int x = P / 60;
        int y = P % 60;


        if (b + c < 60) {
            System.out.printf("%d %d", a, b + c);
        } else if (b + c >= 60) {
            if (a + x >= 24) {
                System.out.printf("%d %d", ((a + x)-24), y);
            }
            else if ( a+x <24){
            System.out.printf("%d %d", (a + x), y);
            }
        }


    }
}