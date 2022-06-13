package datastructure.Chap06.insertion;


import java.util.Arrays;
import java.util.Scanner;

// 백준 11399
public class ATMt {

    // insertion sort
    public static void sort(int[] arr) {
        //  삽입할 항목 타겟팅 설정
        for (int i = 1; i <arr.length;  i++) {
            // 삽입할 항목 빼놓기
            int temp = arr[i];
            int j = i ; // 삽입할 위치 인덱스
            // 삽입할 위치 탐색
            // 삽입할 항목보다 큰 값들은 오른쪽으로 이동
            while (j > 0 && arr[j-1] >=temp){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp; // 삽입할 위치에 삽입

        }
    }
    public static void main(String[] args) {

        System.out.println("입력하셈");
//        3 1 4 3 2
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i] = sc.nextInt();
        }


        sort(arr); // 버블정렬

        System.out.println("정렬후 : " + Arrays.toString(arr));

        int[] temp = new int[arr.length];
        int num = 0;
        for (int i = 0; i <arr.length ; i++) {
            num += arr[i];
            temp[i] = num;
        }
        System.out.println("정렬후 : " + Arrays.toString(temp));
        int sum =0;
        for (int i = 0; i <temp.length; i++) {
            sum += temp[i];
        }
        System.out.println(sum);

    }


}
