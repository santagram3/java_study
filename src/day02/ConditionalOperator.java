package day02;

public class ConditionalOperator {
    public static void main(String[] args) {

        int x = -3;
        int abs = (x>= 0) ? x : -x;
        // 조건식 ? 참일경우  : 거짓일경우
        System.out.println("절대값 :" + abs);
    }
}
