package day08;


//
//import day08.fruit.Apple;
//import day08.fruit.Banana;
//import day08.fruit.Grape;

//import day08.syrub.Apple;

import day08.fruit.*; // fruit.* =  패키지안에 모든걸 가져오겠다 . 수입해오겠다 .


public class Test {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Apple apple2 = new Apple();
        // 다른패키지에 있는 클래스는 풀네임을 명시해야된다 .
        // 그게 싫으면 import를 박아 넣어야 한다 .

        new Banana();
        new Grape();


    }

}
