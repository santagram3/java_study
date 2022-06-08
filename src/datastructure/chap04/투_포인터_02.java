package datastructure.chap04;


import java.util.Arrays;
import java.util.Scanner;

// 백준 1940번
//  1. 오름차 정렬 - Arrays.sort(배열변수)
//          2. s 를 첫위치 e를 끝위치에 둔다
//          3. 찾는 수보다 합산 수가 작은 경우
//          s를 오른쪽으로 한칸 이동
//          4. 찾는 수보다 합산 수가 큰 경우
//          e를 왼쪽으로 한칸 이동
//          5. 찾는 수와 합산 수가 같은 경우
//          count를 증가시키고 s++ , e--
public class 투_포인터_02 {

    public static void main(String[] args) {

        int[] arr = {2, 7 ,4 ,1, 5, 3};
        // 1. 오름차 정렬
        Arrays.sort(arr);

//         System.out.println(Arrays.toString(arr)); 잘 나오는지 확인 됐음
//        [1, 2, 3, 4, 5, 7]


// 2. s 를 첫위치 e를 끝위치에 둔다

        int s = arr[0] ;
        int e = arr[arr.length-1];
        int M = s+e ; // 시작값과 끝값의 합
        int N = arr.length; // 합 구하려는것
        //          3. 찾는 수보다 합산 수가 작은 경우
//          s를 오른쪽으로 한칸 이동

        while (M <N ){

        }








    }
}