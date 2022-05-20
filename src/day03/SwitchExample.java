package day03;

import java.util.Scanner;

public class SwitchExample {
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("###여행지 추천 프로그램 ###");
        System.out.println("[여행을 원하는 계절을 입력하세요]");
        System.out.printf(">>>");
        String season = sc.nextLine();
        
        // switch 괄호 안에는 (정수 , 문자형) 변수를 씁니다.
        // 분기를 나눌 데이터가 있는 변수 
        switch (season){
            // case에는 switch 변수에 들어갈 경우의 수 값을 배치
            // 단 변수는 배치 불가능 , 상수나 리터럴(고정데이터)만 가능 
            case "봄":
                // 현재 케이스에서 실행할 코드 작성 
                System.out.println("봄에는 여의도로 가보세요~");
                break; // 코드가 밑으로 흘러가는 것을 방지
            case "여름": case "summer":
                System.out.println("여름에는 바다로 가보세요~");
                break; // 코드가 밑으로 흘러가는 것을 방지
            case "가을":
                System.out.println("가을에는 벽화마을로 가보세요~");
                break; // 코드가 밑으로 흘러가는 가것을 방지
            case "겨울":
                System.out.println("겨울에는 집으로 가보세요~");
                break; // 코드가 밑으로 흘러가는 것을 방지
            default: // else 기능
                System.out.println("[봄,여름,가을,겨울]중에 입력하세요!");


        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        sc.close();

    }
}
