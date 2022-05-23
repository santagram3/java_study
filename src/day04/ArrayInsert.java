package day04;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        int[] arr = {50 ,150 ,200 ,250 ,300}; // length = 5
        int newNumber = 990 ; // 신규 삽입데이터
        int targetIdx = 4 ; //삽입위치

        System.out.println("삽입 전 : " + Arrays.toString(arr));

        // 사이즈 1 더 큰 배열 생성
        int[] temp = new int[arr.length+1]; // length = 6

        // 300 부터 밀어야 한다
        // 300 이 있던 자리는 arr[arr.length-1] = arr[4]
        // arr[4] 이걸 temp의 마지막 자리에 넣어야 한다  = temp[5]
        // = 이 말은 temp[5] = arr[4] =
        // 이 말은 temp[arr.length] = arr[arr.length-1]

        for (int i = arr.length; i > targetIdx; i--) {
            temp[i] = arr[i-1];
        }
//        arr = temp ; temp = null;
        // 돌렸더니
        System.out.println("temp에 배열 : " + Arrays.toString(temp));
        // 삽입 후 : [0, 0, 150, 200, 250, 300]
        for (int i = 0; i <targetIdx ; i++) {
            temp[i] = arr[i];
        }
        // 돌렸더니
        System.out.println("temp에 배열 : " + Arrays.toString(temp));
//        temp에 배열 : [50, 0, 150, 200, 250, 300]
        // 원래 타겟 넘버를 temp배열 넣고싶은 인덱스에
        temp[targetIdx] = newNumber;

        arr = temp ; temp = null;


        // 근데 내가 나와야 하는건
        // 50, 100, 150, 200, 250, 300

        System.out.println("삽입 후 : " + Arrays.toString(arr));
    }
}
