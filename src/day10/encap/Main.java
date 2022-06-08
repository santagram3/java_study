package day10.encap;

public class Main {

    public static void main(String[] args) {

//        Car myCar = new Car("그랜져");
//        // myCar.speed = 30000;
//        myCar.setSpeed(60);
//
//
//        System.out.println("현재속도 : "+ myCar.getSpeed());
//
//        myCar.setMode('R');
//        System.out.println("현재모드 : " + myCar.getMode());

        Car car = new Car("소나타");

        // 시동 먼저 걸고 `` 엔진오일 순환 `` 연료를 주입 `` 실린더 작동
        car.engineStart();
//        car.injectOil(); // 프라이빗 으로 다 잠궈버림 // 근데 밑에있는건 다 엔진스타트에 들어가서 .. 다 작동된다 .
//        car.injectGasoline();
//        car.moveCylinder();


        car.setMode('D');
        car.setSpeed(100);
        car.setSpeed(0);
        car.engineStop();





    }
}
