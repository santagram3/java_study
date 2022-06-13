package day14.program09;

public class Child extends Parent {


    private String name;

    public Child() {
        this("홍길동");
        System.out.println("Child() call");
    }
    public Child(String name) {
//        super(); .// 이녀석이 숨어있어서 (괄호안에 아무것도 없어서 ) 부모의 기본생성자(public Parent())를 부름
        this.name = name;
        System.out.println("Child(String) call");
    }

}
