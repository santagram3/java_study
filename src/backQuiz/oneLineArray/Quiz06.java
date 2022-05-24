package backQuiz.oneLineArray;

import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {

//        1.  조작 전 성적을 배열에 저장
//        2.  조작 전 성적에서 최고점 찾기
//        3.  성적 조작 수행-> 배열을 수정
//        4.  새로운 평균 구하기

        Scanner sc = new Scanner(System.in);

        int study = sc.nextInt(); // 총 과목 갯수 정하기

        int[] scoreList = new int[study];

        for (int i = 0; i <study ; i++) {
            scoreList[i]= sc.nextInt();
        }

        int max = scoreList[0];
        for (int i =1; i <scoreList.length ; i++) {
            if (scoreList[i] > max ) max = scoreList[i];
        }

        // 조작한 점수들을 모아놓을 배열 생성


















    }
}
