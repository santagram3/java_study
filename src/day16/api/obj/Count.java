package day16.api.obj;

public class Count {

    int n ;

    // 생성자 // 객체 호출시 나타나는 함수
    public Count(int n) {
        System.out.println(n + "번 객체 생성됨");
        this.n = n;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(n+"번 객체 소멸 ");
//        super.finalize();
    }
}
