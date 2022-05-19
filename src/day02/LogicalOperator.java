package day02;

public class LogicalOperator {
    public static void main(String[] args) {

        boolean t = true , f = false;
        System.out.println(t & t); // t
        System.out.println(t & f); // f
        System.out.println(f & t); // f
        System.out.println(f & f); // f

        System.out.println(t | t); // t
        System.out.println(t | f); // t
        System.out.println(f | t); // t
        System.out.println(f | f); // f

        System.out.println("\\======================");

        int x = 10 ,y = 20 ;
        boolean result1 = x != 10 & ++y == 21;
        boolean result2 = x == 10 | ++y == 21;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        // 단축 평ㄱ ㅏ!!!!!!!!!!
        // 앞에 결과가 나오면 뒤에껀 아예 계산도 안한다
        int x1 = 10 ,y1 = 20 ;
        boolean result3 = x1 != 10 && ++y1 == 21;
        boolean result4= x1 == 10 || ++y1 == 21;

        System.out.println("result1 = " + result3);
        System.out.println("result2 = " + result4);
        System.out.println("x1 = " + x1);
        System.out.println("y1 = " + y1);

        System.out.println("=======================");
        // 논리 반전 (!) - 단항 연산자
        System.out.println(!t); // 트루에 낫 // false

        // 산술연산자
        System.out.println(5+6);
        // 더하기
        System.out.println("안녕"+"하세요");




    }
}
