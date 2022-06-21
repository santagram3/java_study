package datastructure.chap09.greedy;


import java.lang.reflect.Array;
import java.util.*;

// 백준 1541
public class 그리디02 {


    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        String s= sc.nextLine();

        String ss= "1+20+30-50+66+15-48-55+15+51";
        StringTokenizer st = new StringTokenizer(ss); //[1+20+30, 50+66+15, 48, 55+15+51]
        System.out.println(st);
        int count = 0;
        String[] sArr = ss.split("-");

        System.out.println(Arrays.toString(sArr));
        int a = sArr.length;
        System.out.println(a);
        for (int i = 0; i <sArr.length ; i++) {
//            sArr[i].split("+");
        }










    }


}
