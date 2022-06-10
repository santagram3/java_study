package day13.poly.casting;

import utility.Util;

public class Main {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1(); // 부모꺼
        parent.m2(); // 부모꺼 //부모는 자식꺼는 쓸수없다

        System.out.println("=================");
        Child child = new Child();

        child.m1(); // 나한테 없는거 부모꺼 갔다씀
        child.m2(); // 오버라이딩 된거 나옴
        child.m3(); // 내가 만든거 나옴
        System.out.println("=================");
        Parent cc = new Child();

        cc.m1(); // 나한테 없는거 부모꺼 갔다씀
        cc.m2(); // 오버라이딩 된거 나옴
//        ((child)cc).m3(); // 내가 만든거 나옴

        Util.line();

    }

}
