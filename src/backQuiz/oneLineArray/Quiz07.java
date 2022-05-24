package backQuiz.oneLineArray;

import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int count = 0;
        char[] arr = new char[s.length()];

        for (int i = 0; i <s.length()-1; i++) {
            arr[i] = s.charAt(i);
        }

        for (int i = 0; i <s.length()-1 ; i++) {
            if (arr[i] == 'o'){
                if(arr[i] == arr[i+1]){
                    if (arr[i] == arr[i+1] && arr[i+1] == arr[i+2] ){
                        count +=3;
                    }
                    count += 2;
                }
                count += 1;
            }
            else {
                count += 0;
            }
        }
        System.out.println(count);


//        String s = "OOXXXOOXX";
//        // 문자열 특정 단일문자 취득
//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(2));
//        // 문자열 길이 구하기
//        System.out.println(s.length());












    }
}
