package backQuiz.loop;

import java.util.Scanner;

public class Loop09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Number = sc.nextInt();
        String count = "";


        for (int i = 0; i < 5; i++) {
            
        }
        
        
        for (int v = Number; v > 0; v--) {
            for (int x = v; x > 0; x--) {
                count += " ";
                
            for (int y = Number - v; y < Number; y++) {
                count += "*";
            }
            }
            System.out.println(count);
        }

    }
}

