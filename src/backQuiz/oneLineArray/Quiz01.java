package backQuiz.oneLineArray;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 최소 최대 값 문제

        // 정수의 갯수 입력받기
        int N = sc.nextInt(); // 입력받을 정수의 개수

        // 정수의 갯수 입력받아서 배열 만들기

        int[] arr = new int[N]; // 입력받은 정수들을 저장할 배열

        // N만큼 반복해서 입력받은 정수를 순차적으로 배열에 초기화
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(arr));

        int min = arr[0] , max = arr[0];
        for (int x : arr){
            max = x > max ? x : max ;
            min = x < min ? x : min ;
        }
        System.out.printf("최소 : %d , 최대 : %d " , min , max);
        System.out.println(min);
        System.out.println(max);




    }
}
