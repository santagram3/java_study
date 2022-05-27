package programers.level1;


import java.util.Arrays;

public class x만큼_간격이_있는_n개의_숫자 {

    public static long[] solution(int x, int n) {


        long[] arr = new long[n];
        // 길이가 n 인 배열 만들기

        long count = 0;
//        x 를 받아줄 변수 만들기
        for (int i = 0; i <n; i++) {
            arr[i] = count + x;
//            arr 배열에 x 변수 를 넣기
            count += x;
//            x 변수를 증가시켜서 누적시키기

        }
//        System.out.println(Arrays.toString(arr));
        // 배열이 잘 나오는지 확인하기


        return arr;

    }

    public static void main(String[] args) {

        System.out.println(solution(3,3));
    }
}
