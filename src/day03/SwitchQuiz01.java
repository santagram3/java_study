package day03;

import java.util.Scanner;

public class SwitchQuiz01 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("직급을 입력하세요");
        System.out.println("[사원,대리,과장,부장,차장]");
        System.out.printf(">");
        String season = sc.nextLine();

        // switch 괄호 안에는 (정수 , 문자형) 변수를 씁니다.
        // 분기를 나눌 데이터가 있는 변수
        switch (season){
            // case에는 switch 변수에 들어갈 경우의 수 값을 배치
            // 단 변수는 배치 불가능 , 상수나 리터럴(고정데이터)만 가능
            case "사원":
                // 현재 케이스에서 실행할 코드 작성
                System.out.println("사원을 급여는200입니다");
                break; // 코드가 밑으로 흘러가는 것을 방지
            case "대리":
                System.out.println("대리 급여는300입니다");
                break; // 코드가 밑으로 흘러가는 것을 방지
            case "과장":
                System.out.println("과장을 급여는400입니다");
                break; // 코드가 밑으로 흘러가는 가것을 방지
            case "차장":
                System.out.println("차장을 급여는500입니다");
                break; // 코드가 밑으로 흘러가는 것을 방지
            case "부장":
                System.out.println("부장을 급여는600입니다");
                break; // 코드가 밑으로 흘러가는 것을 방지
            default: // else 기능
                System.out.printf("%s(은)는 없는 직급입니다!.\n 다시 입력해주세요",season);


        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        sc.close();

    }
}
