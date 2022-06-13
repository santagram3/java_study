package datastructure.Chap06.Selection;

import java.util.Arrays;
import java.util.Scanner;

public class 소트인사이드t {

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

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
            String num = sc.nextLine();
            int[] temp = new int[num.length()];
        for (int i = 0; i <num.length(); i++) {
            temp[i] = num.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(temp));

        sort(temp);
//
//        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};
//
//        sort(arr); // 버블정렬
//
//
        System.out.println("정렬후 : " + Arrays.toString(temp));

        for (int i = 0; i <(temp.length/2) ; i++) {
            int temp2 = temp[i];
            temp[i] = temp[temp.length-i-1];
            temp[temp.length-i-1] = temp2;
        }
        System.out.println("리버스후 : " + Arrays.toString(temp));

        String s = "";
        for (int i = 0; i <temp.length ; i++) {
            s += temp[i];
        }
        System.out.println(s);



    }
}