package day02;

public class RandomExample {
    public static void main(String[] args) {


        // 난수 생성
        // 0.0 <= ~ <1.0
        double rn = Math.random();
        System.out.println(rn);
        System.out.println("rn = " + rn);

//        1 이상 10 이하의 랜덤정수

        // Math.random();    ->  0.0 <= ~ < 1.0
        // Math.random() * 10 ;    ->  0.0 <= ~ < 10.0
        // (int) (Math.random() * 10 ); ->  0<= ~ < 10
        // (int) (Math.random() * 10 ) + 1 ; ->  1<= ~ < 11


        int num1  = (int) (Math.random() * 10 ) + 1 ;
        System.out.println("num1 = " + num1);
        int num2  = (int) Math.random() * 10  + 1 ;
        System.out.println("num2 = " + num2);
        int num3  = (int) Math.random() * 10   ;
        System.out.println("num3 = " + num3);





    }
}
