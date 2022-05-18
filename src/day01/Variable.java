package day01;

public class Variable {

    public static void main(String[] args) {

        // 변수의 선언 (타입 지정 )
        int score;

        // 변수의 초기화
        score = 70;
        System.out.println(score);

        // 가능
        int life = 3;
        // 변수값 변경
        life = 5;

        System.out.println(life);

        int triple = score*3;
        System.out.println(triple);

//        soutv 명령어
        System.out.println("triple = " + triple);

//        정수 : int , 실수 : double , 문자열 :string
        String nickName = "짹쨱이";
        System.out.println("nickName = " + nickName);

//        nickName = 5.5;  변수 타입과 다른 값은 저장 불가

//        double score = 3.3; 같은 범위 안에선 같은 이름 쓸 수 없음

//        String userName = "홍길동";  홀길동 쓰고 Ctrl + Alt + V 누르면 변수저장이 쉽다

        double random = Math.random();

//        Ctrl + Alt + V 단축키


    }

}
