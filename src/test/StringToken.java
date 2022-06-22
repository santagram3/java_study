package test;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringToken {

    public static void main(String[] args) {
   String s = "짜장면 탕수육 볶음밥 라면 김밥 ";
    StringTokenizer st = new StringTokenizer(s, " ");
//        System.out.println(Arrays.toString(st));
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        System.out.println("==============");
        System.out.println(st);

    }
}
