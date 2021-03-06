package day15.exception;

public class TryExample {

    public static void main(String[] args) {


        int n1 = 120 ;
        double n2 = 2.4;
        System.out.println("나눗셈 시작 ");

        try {
            // 예외 발생 가능성이 있는 코드
            System.out.printf("%d / %d = %d",n1 , n2 , n1/n2);
        }
        catch (Exception e){ // 처리할 예외에 대한 클래스
//           예외 발생시 실행할 코드
            System.out.println("0으로 나눌 수 없습니다.");
            // 예외 처리 후에 예외 로그를 보고 싶을때
//            e.printStackTrace();
            // 전체로그 말고 예외 원인 메세지만 확인하고 싶을때
            System.out.println(e.getMessage());
//            d != java.lang.Double
        }
        System.out.println();
        System.out.println("==============");
        System.out.println("프로그램 종료 " );



    }
}
