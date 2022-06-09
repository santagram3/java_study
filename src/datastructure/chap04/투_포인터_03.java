package datastructure.chap04;


import java.util.Arrays;
import java.util.Scanner;

// 백준 1253번 좋다
public class 투_포인터_03 {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        long N = sc.nextLong(); // 재료의 개수
//
//        long[] A = new long[(int) N];
//        for (int i = 0; i < N; i++) {
//            A[i] = sc.nextInt();
//        }
        // 1. 오름차 정렬
        long[] A = {1, 2, 7, 4, 6, 5, 3, 8, 9, 10};
        Arrays.sort(A);

        System.out.println(Arrays.toString(A)); //


        // 자기 자신이 아닌 다른 수 두 개의 합으로 나타낼 수 있다면 그 수를 “좋다(GOOD)”고 한다.
        int start = 0; // 스타트 포인터의 초기 인덱스
//        int end = (int) N - 1; // 엔드포인터의 초기 인덱스
        int end = A.length - 1;
        int count = 0;
        // 투 포인터 알고리즘
        // start 와 end 가 역전될때까지
        for (int i = 0; i < A.length; i++) {
            while (i < A.length) {
                long good = A[start] + A[end];
                System.out.printf("start: %d, end: %d, good: %d, count: %d\n"
                        , start, end, good, count);
                if (A[i] == A[start]) {
                    start++;
                }

                if (A[i] == good) {
                    count++;
                }
                if (start == end) {
                    start++;
                    end--;
                } else if (A[i] > good) {
                    start++;
                } else if (A[i] < good) {
                    end--;
                }
//                System.out.println(count);
            }
        }
    }
}


