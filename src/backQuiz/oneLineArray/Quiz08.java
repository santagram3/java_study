package backQuiz.oneLineArray;

import java.util.Scanner;

public class Quiz08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //큰 학교
        int N = sc.nextInt();




        int[] scoreList = {50 , 50 , 70 ,80, 100};

        double total = 0; //
        int count = 0; // 평균 넘은 학생수
        for (int i = 0; i <5 ; i++) {
            total += scoreList[i];
        }
        System.out.println(total);

        System.out.println(total/5); // 평균점수 70점

        for (int i = 0; i <5; i++) {
            if (total/5 >scoreList[i]) {
                count += 1;
            }
        }
        System.out.println(count); // 평균 넘은 학생수  2명
        // 평균넘은 학생수 /총 학생수  = = 2 / 5
        System.out.printf("",((double)count / 5)*100);
//        System.out.printf("비율은 %.3f입니다.\n",rate);


    }
}
