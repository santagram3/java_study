package day04;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        // 1. 배열 변수 선언
        int[] arr;

        // 2. 배열의 생성
        arr = new int[5];
        // 첫번째 방 주소
        System.out.println(arr);

        // 3. 배열값 초기화 (배열값 넣기)
        arr[0] = 30;
        arr[1] = 99;
        arr[2] = arr[0] + 20;
        arr[3] = (int) 66.7;
        arr[4] = 100;
//        arr[5] = 55;
        // 치명적인 런타임 오류
//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//        at day04.ArrayBasic.main(ArrayBasic.java:18)
        // 배열 길이는 5인데 5를 초과한 6번째를 넣어서 안됨

        // 배열의 길이  - 저장 데이터 개수
        System.out.printf("배열의 길이: %d\n", arr.length);
//        arr[4] = 100; // 이거를 주석처리해도 길이는 5가 나온다

        // 배열 내부 값 확인

//        System.out.printf("%d ",arr[0]);
//        System.out.printf("%d ",arr[1]);
//        System.out.printf("%d ",arr[2]);
//        System.out.printf("%d ",arr[3]);
//        System.out.printf("%d ",arr[4]);  // 묶어서 Alt + Enter - 배열로 축소

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ",arr[i]);
        }
        System.out.println(); // 줄바꿈
        System.out.println("======================");

        // 배열 전용 반복문 (향상된 for :Enhanced for Loop)
         for (int n : arr) {
             System.out.printf("%d " , n);
         }
        System.out.println("\n======================");

         // 배열 내부값 출력 함수
        System.out.println(Arrays.toString(arr));
//        Arrays.toString(arr); Ctrl + Alt + V

        // 값 목록을 나열하여 배열 생성하기
        int[] numbers = new int[] {10,20,30,40};

        System.out.println(Arrays.toString(numbers));

        // new String[] 이런 구문은 배열변수 선언시에만 생략가능
        String[] foods = new String[] {"사과", "복숭아", "파인애플"};
//        String[] foods = {"사과", "복숭아", "파인애플"};
        foods[1] = "수박";
        System.out.println(Arrays.toString(foods));
        // 새로 갈아끼울땐 new String[] 을 생략 하면 안된다 .
       foods = new String[] {"짜장면" , "탕수육" , "짬뽕"};
        System.out.println(Arrays.toString(foods));

        /// 배열을 생성만하고 초기화(대입)하지 않는다면 ?
        // - 해당 타입의 기본값으로 자동 초기화됨 .
        // 빈배열 만들기 : []안에 0을 넣어야 한다 .
        System.out.println("===========================");

        double[] dArr = new double[3];

        System.out.println("dArr.length = " +dArr.length);
        System.out.println(Arrays.toString(dArr));
        System.out.println("===========================");

        short[] arr2 = new short[3];

        System.out.println("dArr.length = " +arr2.length);
        System.out.println(Arrays.toString(arr2));
        System.out.println("===========================");

        String[] arr3 = new String[3];

        System.out.println("dArr.length = " +arr3.length);
        System.out.println(Arrays.toString(arr3));
        System.out.println("===========================");

        long[] arr4 = new long[3];

        System.out.println("dArr.length = " +arr4.length);
        System.out.println(Arrays.toString(arr4));
        System.out.println("===========================");





    }
}
