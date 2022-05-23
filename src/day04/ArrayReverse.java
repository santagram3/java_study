package day04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        System.out.println("reverse 전 :" + Arrays.toString(arr));

//        int temp = arr[0];
//        arr[0] = arr[6];
//        arr[6] = temp;
//
//        int temp = arr[1];
//        arr[1] = arr[5];
//        arr[5] = temp;
//
//        int temp = arr[2];
//        arr[2] = arr[4];
//        arr[4] = temp;


        //reverse 알고리즘
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("reverse 후 : " + Arrays.toString(arr));

    }
}
