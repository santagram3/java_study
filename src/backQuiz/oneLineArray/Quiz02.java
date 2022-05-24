package backQuiz.oneLineArray;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 최소 최대 값 문제


        // 길이가 9인 배열 만들기
        int[] arr = new int[9]; // 입력받은 정수들을 저장할 배열

        // N만큼 반복해서 입력받은 정수를 순차적으로 배열에 초기화
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // 배열에서 최대값 찾기
        int max = arr[0];
        for (int x : arr){
            max = x > max ? x : max ;
        }

        // 포문으로 배열을 돌려서
        // 만약 하나씩 매칭될때의 값과 맥스값이 같을때
        // 의 i값은 인덱스 값일것이다
            int idx = 0;
        for (int i = 0; i <9; i++) {
            if (arr[i] == max){
                idx = i+1;
            }
        }

        System.out.println(max);
        System.out.println(idx);




    }
}
