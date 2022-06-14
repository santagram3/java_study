package datastructure.chap07.radix;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 주의 사항
// 음수는 이 방법 대로 못한다 ... . . . . . . . . 하려면 다른걸 해야지 ㅋㅋㅋ
public class RadixSort {


    public static void sort(int[] arr) {

        // 최대 자리수 구하기
        int digit = 0;
        for (int n : arr) {
            int len = String.valueOf(n).length();
            if (len > digit) {
                digit = len;
            }
        }
        Queue<Integer>[] queues = new Queue[10];
        for (int i = 0; i < queues.length; i++) {
            queues[i] = new LinkedList<>();
        }

         /*
           1회차 루프(i==0)에서는 각 숫자의 1의 자리수를 뽑아서
           위치에 맞는 큐에 삽입해야함.

           2회차 루프(i==1)에서는 각 숫자의 10의 자리수를 뽑아서
           위치에 맞는 큐에 삽입해야함.

           3회차 루프(i==2)에서는 각 숫자의 100의 자리수를 뽑아서
           위치에 맞는 큐에 삽입해야함.
         */


        for (int i = 0; i < digit; i++) {
            for (int j = 0; j < arr.length; j++) {
                 /*
                i = 0일때는 1의 자리수 뽑기
                i = 1일때는 10의 자리수 뽑기
                i = 2일때는 100의 자리수 뽑기

                예를 들어 753이면 i = 0일 때는 3을 뽑아야 함
                예를 들어 753이면 i = 1일 때는 5을 뽑아야 함
                예를 들어 753이면 i = 2일 때는 7을 뽑아야 함

                753 / 10^0 % 10      ==>  3
                753 / 10^1 % 10 ==>  5
                753 / 10^2 % 10 ==> 7

                target / 10^i % 10
             */

                int n = arr[j] / (int) Math.pow(10, i) % 10; // Math.pow(10 , 3) = double 로 나옴 , 10 ^3 승 1000임
                // 해당 자리 수에 맞는 큐에 저장
                queues[n].add(arr[j]);
            } // end inner for(arr)

            // 큐에서 순서대로 poll 하여 배열에 다시 저장
            int k = 0; // 배열 저장 위치 엔덱스
            for (Queue<Integer> q : queues) {
                while (!q.isEmpty()) {
                    arr[k++] = q.poll(); // 이거 완전 신박했다 .
                }
            }

        } // end outer for (digit)


    }


    public static void main(String[] args) {
        int[] arr = {753, 427, 450, 422, 220, 125, 332, 339, 1990, 660};

        sort(arr);

        System.out.println("정렬후 " + Arrays.toString(arr));
    }

}
