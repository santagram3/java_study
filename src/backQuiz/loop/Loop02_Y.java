package backQuiz.loop;

import java.util.Scanner;

public class Loop02_Y {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for(int i=1; i <= n ; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(a+b);
        }

    }
}
