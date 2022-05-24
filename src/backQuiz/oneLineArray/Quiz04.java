package backQuiz.oneLineArray;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {

//        나머지들을 저장할 배열 (10개)
//
//                [ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 ]
//
//        10개의 수를 반복해서 42로 나눈 나머지를 배열에 순차적으로 저장하는데
//        단! 저장 전에 이미 저장되었는지 체크한 후 저장한다.
//        이미 저장되었다면 해당 나머지는 배열에 넣지않는다.
//
// [ 10, 20, 0, 1, 5, -1, -1, -1, -1, -1 ]
//
//        10, 20, 42, 85, 5, 84, 52


        Scanner sc = new Scanner(System.in);
        // 최소 최대 값 문제

        int[] arr = new int[10];

        for (int i = 0; i <10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("==========================");
        int[] arr2 = new int[10];

        for (int i = 0; i <10; i++) {
            arr2[i] = (arr[i] % 42);
        }
        System.out.println(Arrays.toString(arr2));

        System.out.println("==========================");
        int[] arr3 = new int[10];

        for (int i = 0; i <10; i++) {
            if ( arr2[i] != arr2[i] ){
             arr3[i] = arr2[i];
            }
        }
        System.out.println(Arrays.toString(arr3));















        }
}
