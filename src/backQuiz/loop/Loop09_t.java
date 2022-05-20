package backQuiz.loop;

import java.util.Scanner;

public class Loop09_t {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Number = sc.nextInt();
        String count = "";


        for (int i = 0; i < Number; i++) {
            //공백을 반복해서 찍고
            for (int j = 0; j < Number-1-i; j++) {
                count += " ";
            }
            //별을 반복해서 찍는코드
            for (int j = 0; j < i+1; j++) {
                count += "*";
            }
            count += "\n";
        }
        System.out.println(count);

    }
}

