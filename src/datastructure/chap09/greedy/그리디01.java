package datastructure.chap09.greedy;


import java.util.Scanner;

// 백준 11047
public class 그리디01 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000};
        int k = 4200;
        int t = 0;
        while (k >= 0) {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] <= k) {
                    int a = k / arr[i];  // 4
                    t += a;
                    k %= a;

                }
                if (k == 0) {
                    break;
                }
                System.out.println(t);
            }

        }
    }


}
