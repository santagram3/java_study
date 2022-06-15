package day16.api.string;

import datastructure.Chap06.insertion.InsertionSort;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringExample {


    public static void main(String[] args) {

        String s = "라면 떡볶이 보쌈 짜장면";
        // 문자열 쪼개기
//        s.split(" ");
//        split(" "); 배열로준다
        String[] sArr = s.split(" "); //  정규표현식을 배우면 그때 써먹자

        System.out.println(Arrays.toString(sArr));
        String s2 = "1 2 3 4 ";
        // 문자열 쪼개기
//        s.split(" ");
//        split(" "); 배열로준다
        String[] sArr2 = s2.split(" ");
        int[] numbers = new int[sArr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(sArr2[i]);
        }
        System.out.println(Arrays.toString(numbers));

        // 문자열 쪼개기 2 번
        s = "짜장면 탕수육 볶음밥 라면 김밥 ";
        StringTokenizer st = new StringTokenizer(s, " ");
        System.out.println(st.countTokens());  //
        String[] foods = new String[st.countTokens()];

        for (int i = 0; st.hasMoreTokens(); i++) {
            foods[i] = st.nextToken();
        }
        System.out.println(Arrays.toString(foods));
//        [짜장면, 탕수육, 볶음밥, 라면, 김밥]

        int i1 = st.countTokens();
        for (int i = 0; i < i1; i++) {
            foods[i] = st.nextToken();
        }
        System.out.println(Arrays.toString(foods));
//        [짜장면, 탕수육, 볶음밥, null, null]


        System.out.println("=====================");
        long ss = System.currentTimeMillis();
//        String  str = "";
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i <10; i++) {
//            str += (i+1);
            sb.append(i+1);
        }
        System.out.println(sb);

        long ee = System.currentTimeMillis();




        System.out.println((ee-ss) + "ms");










    }


}
