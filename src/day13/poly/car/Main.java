package day13.poly.car;

import utility.Util;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Car g1 = new Granduer();
        Car g2 = new Granduer();
        Car g3 = new Granduer();

        Car m1 = new Mustang();
        Car m2 = new Mustang();

        Car s1 = new Stinger();
        Car s2 = new Stinger();


        Car[] cars = {g1, g2, g3, m1, m2, s1, s2, new Granduer(), new Mustang(), new Stinger()};

        for (Car c : cars) {
            c.run();
        }

//        그랜저가 달립니다.
//        그랜저가 달립니다.
//        머스탱이 달립니다.
//        머스탱이 달립니다.
//        스팅어가 달립니다.
//        스팅어가 달립니다.
//         밑에 이건 왜 나오는걸까 ?
//        그랜저가 달립니다.
//        머스탱이 달립니다.
//        스팅어가 달립니다.

        int a = 1;
        long b = 2L;
        double c = 1.1;
        long d = 3;
        double[] dArr = {a, b, c};

        System.out.println(a + d);

        // 모든 타입의 변수를 담는 것
        Object[] oArr = {10, 3.3, "하하호호", new Mustang(), true, false};

        System.out.println(Arrays.toString(oArr));

        System.out.println(" = ===============================");

        // 다양성 , 오버로딩 , 상속의 집합체
        Driver kim = new Driver();
        kim.drive(new Mustang());
        kim.drive(new Granduer());

        System.out.println(" = ===============================");

        Car myCar = kim.buyCar("그랜져");
        //마이카는 , 바이카에 (스트링)그랜져가 들어갔을때 나오는 리턴값  , 그랜져 이기때문에
        // 그랜져.run(); 이 되는거다
        myCar.run();
        // 킴은 차를 산다 (그랜져) . 달린다.
        kim.buyCar("그랜져").run();

        new Driver().buyCar("머스탱").run();
        kim.drive(kim.buyCar("스팅어"));

        System.out.println(" = ===============================");

        Mustang mm = new Mustang();
        Car cc = mm; // 업캐스팅
        mm = (Mustang) cc; // 다운캐스팅
        System.out.println("cc = " + cc);
        System.out.println("mm = " + mm);


        // 안되는 문법 - 부모객체를 자식타입으로 변환 할 수 없음
//        Car ccc = new Car();
//        Mustang mmm = (Mustang) ccc;

        System.out.println(" = ===============================");

//        Car myMs = kim.buyCar("머스탱");  이걸

        Mustang myMs = (Mustang) kim.buyCar("머스탱"); // 이렇게 변환해준다
        myMs.run();
        myMs.joinMustangClub();

        Util.line();

        CarShop shop = new CarShop();
        int money = shop.sellCar(g1);
        
        System.out.println("money = " + money);
        
        int money2 = shop.sellCar(m2);
        System.out.println("money2 = " + money2);

        Util.line();

        cast("안뇽");
        cast(m1);

    } // end main

    // 별별별별별별벼렵렵려별벼렵려벼려별벼려벼려볍려벼벼려별벼려별별별별별
    public static void cast(Object o) {
        if (o instanceof String) {
            String s = (String) o;
            System.out.println("스트링 변환 성공");
        } else {
            System.out.println("변환 불가능");
        }
    }


}
