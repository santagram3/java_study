package datastructure.Chap06.bubble;


import java.util.Scanner;

// 백준 1517번
public class 버블_소트 {
        static int count = 0;
    public static void sort(long[] arr) {
        // 비교 범위에 대한 루프
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 왼쪽이 더 크면 자리바꿈
                    long temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                } // if

            } //forj

        }// fori

    } // sort

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i <N ; i++) {
            arr[i] = sc.nextLong();
        }

        sort(arr);
        System.out.println(count);

    }
}
