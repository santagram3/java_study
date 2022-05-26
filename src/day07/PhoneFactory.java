package day07;

// 실행용 클래스
// main메서드를 생성
public class PhoneFactory {

    public static void main(StringEqual[] args) {

        // Phone 객체 생성

        Phone galaxy = new Phone();
        //타입 ,     =     , 생성자함수
        // 객체의 속성과 기능을 참조 ( . 연산자)
//        galaxy.model = "갤럭시 S21";
//        galaxy.color = "펄 블루";
//        galaxy.price = 1000000;
        galaxy.model = "갤럭시";

//        galaxy.powerOn();
        galaxy.showSpec();

        System.out.println("=================");

        Phone iPhoneX = new Phone("아이폰");
        iPhoneX.showSpec();

        System.out.println("=================");

      Phone gNote = new Phone("갤럭시 노트", "제니레드");

        gNote.showSpec();

        System.out.println("=================");

       Phone xhaomi = new Phone("샤오미" , "화이트" , 20000);
       xhaomi.showSpec();






    }

}
