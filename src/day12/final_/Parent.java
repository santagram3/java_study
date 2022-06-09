package day12.final_;

class child extends Parent{
    // 부모에 final 을 붙이면 자식 클래스에 extends Parent 를 못한다

//    void m1() // 오버라이딩 제한 되서 안됨

    @Override
    void m2() {
        String s;
    }

    void m4() {}
}



//public final class parent { // 상속 제한
public class Parent {


    final void m1(){} // 오버라이딩 제한
    void m2(){}
    void m3(){}


}
