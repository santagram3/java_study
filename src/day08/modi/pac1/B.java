package day08.modi.pac1;

 public class B {


    // 오버로딩 조건 : 매개변수의 타입, 순서 , 개수가 달라야 함
   public B(String s){}
    B(int x){}
    private B(double d){};


   B b1 = new B("zzz");
    B b2 = new B(2);
//    B b3 = new B(5.6);

//    B(String y,int z ){}
//    B(int z, String y){}
//    B(int m , int t, int z){}
//


    public static void main(String[] args) {
    A a = new A();
    a.f1 = 10;// public
    a.f2 = 20; // default
//    a.f3 = 30; // private

        a.m1();
        a.m2();
//        a.m3();


    }

}
