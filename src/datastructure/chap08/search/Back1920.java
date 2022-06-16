package datastructure.chap08.search;

import java.util.Arrays;
import java.util.Scanner;

public class Back1920 {

    // 이진 탐색
    public static int binarySearch(long[] arr, long target) {
        // 왼쪽포인터, 오른쪽 포인터, 중앙포인터 선언
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            // mid 인덱스 계산
            mid = (left + right) / 2;

            // 찾고자 하는 값이 mid값과 일치할 경우 탐색 종료
            if (arr[mid] == target) {
                return 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a= sc.nextLong(); // 길이 제한

        long[] b = new long[(int) a];
        long[] c = new long[(int) a];
        for (int i = 0; i <a ; i++) {
            b[i] = sc.nextLong();
        }
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        for (int i = 0; i <a ; i++) {
            c[i] = sc.nextLong();
        }
        System.out.println(Arrays.toString(c));
//        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        for (int i = 0; i <a ; i++) {
            System.out.println(binarySearch(b ,c[i]));
        }






    }

}
