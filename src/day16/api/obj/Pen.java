package day16.api.obj;

// 객체 복사를 사용하려면 Clonable 인터페이스를 구현해야함 .
public class Pen extends Object implements Cloneable {

    Company company; // 제조사 정보
    long serial; // 일련번호
    String color; // 색상
    int price; // 가격


    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    public Pen(Company company, long serial, String color, int price) {
        this.company = company;
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    // 일련번호 같으면 같다고 해버리기~
    @Override
    public boolean equals(Object o) {
        // 이퀄라이즈 함수를 오버라이딩 룰로 가져온거기 때문에
        // 이름 , 리턴값 , 들어가는 값이 모두 같아야 한다
        // 부모가 오브젝트인건 class 에 extends Object 있기 때문이고
        // 기본적으로 모든 클래스에 오브젝트 클래스가 생략(숨겨져) 있다
        if (o instanceof Pen) {
            Pen p = (Pen) o;
            // Pen p 에 넣으려면 Pen 에 맞게 들어가야 하므로
            // o 를 (pen) 으로 캐스팅 한것이다

            return this.serial == p.serial;
        }
        return false;
    }

    //


    //  clone : 객체 복사 : 얕은 복사 개념 (해당 포인터 객체만 복사 )
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // 깊은 복사 : 해당 객체 뿐만 아니라 컴포지션된 객체도 모두 복사
    public Pen deepClone() throws CloneNotSupportedException {
        // 1. 우선 얕은 복사 진행
        Pen copy = (Pen) this.clone();
        // 2. 컴포지션된 객체도 복사 진행
        copy.company = (Company)copy.company.clone();
        return copy;

    }


    @Override
    public String toString() {
        return "Pen{" +
                "company = " + company +
                "serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}