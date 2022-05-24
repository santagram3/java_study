package day02;

public class StdOutput {

    public static void main(String[] args) {

        String dog = "멍멍이" , cat = "야옹이";

        System.out.println(dog);
        System.out.print(dog);

        System.out.println("===============");

        System.out.print(dog);
        System.out.println(dog);

        int month = 7;
        int day = 17;
        String anniversary = "제헌절";

        System.out.println(month + "월 " + day + "일은 " + anniversary + "입니다");
//        souf 프린트 에프
        System.out.println("=================================================");
        // %d : 10진수 정수 , %f : 실수 , %s : 문자열 , %c : 단일문자
        System.out.printf("%d월 %d일은 %s입니다.\n" , month , day , anniversary); // 디게 번거롭네
        System.out.println(dog);

        // %f : 강제로 소수점 6자리를 표현합니다.

        double rate = 25.45678901234;
        System.out.printf("비율은 %f입니다.\n",rate);
        System.out.printf("비율은 %.4f입니다.\n",rate);
        System.out.printf("비율은 %.3f입니다.\n",rate);
        System.out.printf("비율은 %.21f입니다.\n",rate);
        System.out.printf("비율은 %.1f%%입니다.\n",rate);
        System.out.printf("비율은 %.0f%%입니다.\n",rate);
        System.out.printf("비율은 %5.0f%%입니다.\n",rate); // 띄어쓰기
        System.out.printf("비율은 %10.0f%%입니다.\n",rate);

    }
}
