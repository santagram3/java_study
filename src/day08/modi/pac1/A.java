package day08.modi.pac1;

public class A {

    // 필드선언

    public int f1;
    int f2; // default제한
    private int f3;


    // 메서드 선언

    public void m1(){}
    void m2(){}
    private void m3(){}

    public A(){
        f1 = 10;
        f2 = 20;
        f3 = 30;

        m1(); m2(); m3();

    }
    B b1 =new B("zzz");
    B b2 =new B(3);
//    B b3 =new B(5.6);



}
