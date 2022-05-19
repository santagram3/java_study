package day02;

public class Casting3 {

    public static void main(String[] args) {
    //
        // 타입이 다른 데이터의 연산에서는
        // 작은 쪽을 큰 쪽으로 변환한 후 연산을 진행
        int a  = 10;
        short b = 30;
        int  c = a + b;

        
        // 문자열 + 숫자 = 문자열 
        // 단일 문자 + 숫자 = 숫자 
        char d = 'A'; // 'A' 는 아스키 코드로 65 d = 65 
        int e = 100;
        System.out.println(d+e);
        
        
        char f = (char) (d + e);
        System.out.println("f = " + f);

        // 리터럴의 데이터
        // 1 정수형 : int
        // 2 실수형 : double
        // 3 논리형 : boolean
        // 4 문자형 : char
        System.out.println(3.0 + 5 ); // 8 or 8.0 뭘까 ?

        // int보다 작은 데이터 (byte, short , char )
        // 끼리의 연산은 결과가 자동으로
        // int 로 변환되어 처리
        // (스택 오버플로우 ,언더플로우 방지)
        byte b1 = 100;
        byte b2 = 20 ;
        int result = b1 + b2 ;
        // char 문자형
        System.out.println('A'+ 'B'); // 131 // 65 + 66 //
        // String 문장형
        System.out.println("A" + "B"); // AB //

    }
}
