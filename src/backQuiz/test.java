package backQuiz;

public class test {

    public static void main(String[] args) {


//        int i = 1234;
//        String s = String.valueOf(i);     문자열 "1234"로 변환
//        String s = Integer.toString(i);   문자열 "1234"로 변환
//        String s = ””+i;                문자열 "1234"로 변환
//        String s = “”+12.34;            문자열 "12.34"로 변환
//        String s = “”+0;                문자열 "0"로 변환
//

        int z = 1234;
        String a = String.valueOf(z);
//        String b = integer.toString(z);

        // 정수를 문자로 바꾸는 코드

        System.out.println(a);
//        System.out.println(b);
        System.out.println(a.charAt(3));
//        System.out.println(b.charAt(3));

        String x = "1234";
        String y = "4321";

        int x1 = Integer.parseInt(x);
        int y1 = Integer.parseInt(y);


        System.out.println(x+y);
        System.out.println(x1+y1);





    }
}
