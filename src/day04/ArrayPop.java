package day04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPop {
    public static void main(String[] args) {
//        배열의 맨 마지막 데이터 삭제

        int[] arr = {10,20,30,40};

        // 1. 기존 배열보다 크기가 1 작은 새 배열 생성
        int[] mArr = new int[arr.length-1];

        for (int i = 0; i <arr.length-1; i++) {
            mArr[i] = arr[i];
        }
        arr = mArr;
        mArr =null;

        System.out.println(Arrays.toString(arr));

    }
}
