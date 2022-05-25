package backQuiz.function;


import java.util.Arrays;

public class quiz02 {


    static int dn(int target) {
        int sum = target;
        while (target > 0) {
            int d = target % 10;
            sum += d;
            target /= 10;
        }
        return sum;
    }

//    static int[] push(int n) {
//
//
//
//    }
//    static int[] temp = new int[] {1,};

    public static void main(String[] args) {


        int t = dn(25);

        System.out.println(t);

        // 1. 생성자 있는 숫자의 배열 만든다
        // 2 배열에 넣을때 중복된 숫자는 뺴버린다
        // 전체 숫자에서 생성자 있는 숫자의 배열을 뺀다
        //그걸 프린트 한다
        //


//        System.out.println(dn(9999));
        boolean[] arr = new boolean[20];

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < 20; i++) {
            int c = dn(i);
            if (c <= arr.length) {
                arr[c - 1] = true;
            }
        }
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == false) {
                System.out.println(i + 1);
            }
        }
    }
}
