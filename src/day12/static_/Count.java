package day12.static_;

import day08.modi.Pac2.C;

public class Count {

    public int x ; // 인스턴스 필드
    public static int y ; // 정적 필드

    public void m1(){
        // 인스턴스 메서드
        System.out.println("x = " + x);
//        System.out.println("x = " + this.x); 위에랑 같다
        System.out.println("y = " + y);
    }
    // static 블록 (메서드 , 정척 초기화자) 에서는
    // static 필드만 참조 가능
    // static 블록은 this를 사용할 수 없음.
//    public static void m2(){
//        // 정적 메서드
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//    }
    // 쓸려면 이렇게 해야된다
    public static void m3(){
        // 정적 메서드
        Count c = new Count();
        System.out.println("x = " + c.x);
        System.out.println("y = " + y);
    }



}
