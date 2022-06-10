package day13.poly.basic;
// 자바는 다형성을 위해 객체들의 부모타입변환을 허용하고 있습니다.
//즉, 부모 타입에 모든 자식 객체를 대입할 수 있습니다
class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}



public class Poly {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        a = b ;

        A X1 = b;
        A x2 = new B();
        A x3 = c;
        A x4 = new D();
        A x5 = e;

        B y1 = new D();
        C y2 = new E();
//        B y3 = new E(); // 상속관계가 아니면 다형성이 적용되지 않음
//        D y4 = new E(); // 상속관계가 아니면 다형성이 적용되지 않음
        // 자식객체는 부모의 타입을 가질수 있다 !

        Object z1 = new E();

//        B z2 = new A(); 부모 객체가 자식 타입을 가질 수 없음














    }

}
