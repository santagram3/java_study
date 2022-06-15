package day16.api.system;

import datastructure.Chap06.Selection.SellectionSort;
import datastructure.Chap06.bubble.BubbleSort;
import datastructure.Chap06.insertion.InsertionSort;
import datastructure.chap07.radix.RadixSort;

import java.util.Arrays;
import java.util.Date;

public class SystemTime {

    public static void main(String[] args) {

        // 현재 시간 읽기
        // 유닉스 시간 : 1970년 1 월 1일 00 시를 기준으로 
        //              현재까지의 지ㅣ나온 시간을 초로 표현 

        long now = System.currentTimeMillis();
        System.out.println("now = " + now);
//        Date date = new Date(now);  // 현재시간
        Date date = new Date(now + (5 * 24 * 60 * 60 * 1000)); // 5일 뒤  // 5 일 * 24시간 * 60분 * 60초 * 1000밀리초
        System.out.println("date = " + date);


        System.out.println("===================");

        int[] arr = new int[100000];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr.length - i;
        }
        // 정렬 알고리즘 시간 테스트
        long s = System.currentTimeMillis();

//        BubbleSort.sort(arr); // 버블 정렬 : 4523ms
//        SellectionSort.sort(arr); // 선택 정렬 : 3700ms
//        InsertionSort.sort(arr); // 삽입 정렬 : 1782ms
//        RadixSort.sort(arr); // 기수정렬 : 78ms
//        Arrays.sort(arr); // 퀵정렬 : 0ms

        long e = System.currentTimeMillis();

        System.out.println((e-s) + "ms");


    }
}
