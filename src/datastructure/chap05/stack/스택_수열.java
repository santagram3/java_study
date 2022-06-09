package datastructure.chap05.stack;

import java.util.Stack;

//백준 1874
public class 스택_수열 {

    public static void main(String[] args) {

        int N = 8; // 1 ~ N 까지의 자연수

        // 만들어야 할 수열
        int[] A ={4, 3, 6, 8, 7, 5, 2, 1}; // 이건 정상작동 된다
//        {4,5,1,2,3}; // 은 No 가 나와야됨

        // 자바 api

        Stack<Integer> stack = new Stack<>();

        int num = 1; // 자연수 값 저장

        // 기호를 저장할 문자열
        String s = "";

        // 수열 배열에서 값을 하나씩 뽑아서 push , pop 여부 확인
        for (int i = 0; i < A.length; i++) {
            int targetNum = A[i]; // 현재 수열 값
            if (targetNum >= num) {
                // push인 경우
                while (targetNum >= num) {
                    stack.push(num++);
                    s += "+\n";
                }
                // 마지막에 들어간 수를 pop
                stack.pop();
                s += "-\n";
            } else { // pop 인 경우
                int n = stack.pop(); // 스텍에서 제거한 숫자
                // 스택의 가장 위의 수가 현재 구해야할 수열값보다 크면
                // 수열 출력이 성립이 안되므로
                if (n > targetNum) {
                    s = "No";
                    break;
                } else {
                    s += "-\n";
                }
            }
        }
        //포문 끝나는 자리
        System.out.println(s);


    }


}
