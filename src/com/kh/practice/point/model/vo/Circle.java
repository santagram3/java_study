package com.kh.practice.point.model.vo;

public class Circle extends Point {

    private int radius;

    public Circle(){
    }
    public Circle(int x , int y , int radius){
//        x,y 를 가져오는 방법
//        1. 세터 로 가져온다

//        this.setX(x);
//        this.setY(y);
//
//        2. 부모 super 를 이용한다

        super(x,y);

        this.radius =radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString(){
        return super.toString() + "raiius:" + radius;


    }


}
