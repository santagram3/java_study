package programers.level1;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {

    public static int[] solution(long n) {
        String s = String.valueOf(n);
        // 정수를 문자로 바꾸는 코드
        char[] arr = new char[s.length()];
        // 자리수를 배열에 담을 변수
        // 문자로 바꿨기 때문에 문자의 길이를 알수 있으므로
        // 문자로 문자의 길이를 배열의 길이로 만들어줬다
        for (int i = s.length()-1; i >=0; i--) {
            arr[s.length()-i-1] = s.charAt(i);
        }
        // 끝자리부터 넣어야 하므로
        // 길이로 앞뒤를 바꿀수 있는 식을 세워 i 에 대입한다
//        System.out.println(s.length());
//        System.out.println(s);
//        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[s.length()];
        // 문자배열을 int 배열로 넣을 길이가 같은 배열을 만들어준다
        for (int i = 0; i <s.length(); i++) {
            // 문자배열에 있는 수를 정수배열에 순서에 맞게 넣어준다
            // 이때 arr 배열은 char 배열이기 때문에
            // char 타입을 정수형으로 변환 시켜줘야 한다

            arr2[i] = arr[i]-'0';
        }
//        System.out.println(Arrays.toString(arr2));
        return arr2;
    }

    public static void main(String[] args) {
        solution(1234);
    }
}
