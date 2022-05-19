package day02;

public class DataType {

    public static void main(String[] args) {


        // 정수타입
//        byte a = 128; 127까지 가능하다
        byte a = 127;
//        short b = 32768;
        short b = 32767;
//        int c = 2147483648;
        int c = 2147483647;
//        long d = 2147483648;
        long d = 2147483648L; // 리터럴 + L


        System.out.println("d = " + d);


        int i ;
        double n  = 0.0;
        for (i = 0; i < 100; i++) {
            n +=0.1;
        }

        System.out.println("n = " + n);


        // 실수 타입

//        float f1 = 1.123456785901234; //4bite
        float f1 = 1.123456785901234F; //4bite
        double d1 = 1.123456785901234; // 8byte

        System.out.println("f1 = " + f1);
        System.out.println("d1 = " + d1);

        // 논리 타입
        boolean b1 = true ;
        boolean b2 = false ;

        // 논리 이거 안돼
//        boolean b3 = TRUE ;
//        boolean b4 = 0;
//        boolean b5 = "true";

//        while (true) {
//        }

        // 문자 타입
        // 기본 타입 : char
        // 2byte할당 , 음수개념 x , 글자 1글자만 저장가능 ;
        
        char c1 = 'A'; // 홑 따운표 // 꼭쓰장
        char c2 = 5311;
        System.out.println("c2 = " + c2); //
        char c3 = 55;
        char c4 = 56;
        System.out.println("c3 = " + c3); // 7
        System.out.println("c4 = " + c4); // 8
        System.out.println(c3 * c4); // 3080 -????
        // 문자로 저장 되어있으면 문자 *문자니까 에러나거나
        // 숫자로 저장되어 있으면 7*8 값이 나와야하는거 아닌가 ?


        // 문자열 타입 string
        // String은 기본타입이 아닙니다. 객체입니다.
        String s1 = "hello";

        // 문자 + 숫자 = 문자

        System.out.println(s1 + 300 +120);// hello300120



    }

}
