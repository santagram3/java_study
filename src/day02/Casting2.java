package day02;

public class Casting2 {
    public static void main(String[] args) {


        // downcasting = 하위 타입 변환
        // 다운캐스팅시 값의 손실이 일어날 수 있음 ;;

        // 0011 1110 1000 = 1000;
        int n = 1000;
//        byte m = n;
        byte m = (byte)n;
        // (byte) : 형변환 연산자 , 단항 연산자  ,
        System.out.println("m = " + m);


        // 실수르 없애는 형 변환
        double k = 5.556;
        int j = (int)k ;
        // (int)  : 형 변환 연산자

        System.out.println("j = " + j);




    }
}
