package day15.exception;

public class FinallyExample {

    public static void main(String[] args) {

        String[] pets = {"비둘기","거북이","짹짹이"};

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(pets[i] + " 키울래요~");
                System.out.println(" 애완동물 좋앙요~\n");
            } catch (Exception e) {
                System.out.println("애완동물 정보가 더 이상 존재하지 않습니다.");
            } finally {
                // 예외가 발생하던 발생하지 않던 무조건 실행할 코드
                System.out.println("후뜬달아오를껄");

                // 메모리 누수 방지 코드를 보통 finally에 작성
                // ex ) 데이터베이스 연결코드 , 네트워크 연결코드 , 하드웨어 장치 연결코드 ,

            }
        }
        System.out.println("프로그램 정상종료 ");



    }
}
