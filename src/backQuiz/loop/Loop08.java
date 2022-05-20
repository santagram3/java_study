package backQuiz.loop;

import java.util.Scanner;

public class Loop08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Number = sc.nextInt();
        String count = "";

        for (int i = 1; i <= Number; i++) {
            count +="*";
            System.out.println(count);
        }
    }
}
