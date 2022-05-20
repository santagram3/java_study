package day03;

public class Loop01 {
    public static void main(String[] args) {

        // 정수 n을 입력하면 1부터 n까지
        // 가로로 출력하는 코드

        int n= 10;
        int i = 1;

        while (i<=n) {
            System.out.printf("%d ",i*2);
            i++;
        }

        System.out.printf("======================");

         for (i = 1; i<=10; i++ ){
             System.out.printf("%d ",i);
         }



    }
}

