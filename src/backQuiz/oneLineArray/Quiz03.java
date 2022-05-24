package backQuiz.oneLineArray;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // 1. 3값을 받아온다
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 2. 곱해서 D 에 저장한ㄷ ㅏ
        int D = A*B*C;

        // 3. 나눠서 나온 값을 저장할 빈 배열을 만든다
        int[] arr = {};

        // 4. 반복문으로 D가 0이 될때까지 나눈다
        // 5. D를 10으로 나누면 자리수가 줄어들고
        // 그 자리수가 줄어들때 10으로 나눈 값을 arr에 넣는다
        // arr[i] 를 돌려서
        // if (arr[i] == 0) {
        // count0 += 1;}
        // if (arr[i] == 1) {
        // count1 += 1;}
        // count0~9까지의 배열을 다시 만들어서
        // 배열을 포문으로 돌려서
//        for (int i = 0; i <count.length ; i++) {
//            System.out.println(count[i]);
//        }
//       이렇게 추출하면 끝
        while (true){
            int rest = D % 10;
            int share = D /10;


            if (share == 0) {
                break;
            }
        }









    }
}
