package day07;

public class FieldVariable {

    long a; // field // // 기본값이니까 0
    private int  f ; //
//    private 이라고 해도 같은 클래스 안에서는 쓸수잇다 .

    // 지역변수는 반드시 초기화가 되어있어야 참조가 가능합니다.
    // 필드는 초기화를 하지 않아도 자동으로 각 타입의 기본값으로 초기화합니다.
    // 매개변수는 매서드 호출시 강제로 값이 대입되므로 따로 초기화를 필요가 없습니다.


    void  m1( int c){ //C: parameter

        int b = 1 ; // local variable
        System.out.println("a = " +a); // ? 모르겠다 // 기본값이 나와야 한다  //int 의 기본값은 0
        System.out.println("b = " +b); // b = 1 이니까 1이 나오겠지
        System.out.println("c = " +c); // c = 넣어주는 값이 뭔지에 따라서 달라짐
        System.out.println("f = " +f); //
    }



    public static void main(String[] args) {

        FieldVariable fv = new FieldVariable();
        fv.a = 15;
        fv.f = 11;
        fv.m1(10);
//        int b = 1 ; // local variable
//        System.out.println("a = " +a); // ? 모르겠다 // 기본값이 나와야 한다  //int 의 기본값은 0
//        System.out.println("b = " +b); // b = 1 이니까 1이 나오겠지
//        System.out.println("c = " +c); // c = 넣어주는 값이 뭔지에 따라서 달라짐
       //  이게 나오는것



        System.out.println(fv.a);



    }






}
