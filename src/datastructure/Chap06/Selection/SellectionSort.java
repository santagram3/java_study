package datastructure.Chap06.Selection;

import java.util.Arrays;

public class SellectionSort {


    public static void sort(int[] arr) {

        // swap 대상을 타겟팅하는 루프
        for (int i = 0; i < arr.length - 1; i++) {
            // 최솟값 탐색
            int min = i; // 최솟값을 0번째로 정한다
            for (int j = i + 1; j < arr.length; j++) {
                // 0번째부터 비교를 한다
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }


    }


    public static void main(String[] args) {

        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};

        sort(arr); // 버블정렬


        System.out.println("정렬후 : " + Arrays.toString(arr));

    }
}