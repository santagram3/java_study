package day13.poly.overloading;

public class Rectangle {

//    // 정사각형의 넓이를 구하는 기능
//    public int calcArea01(int len) {
//        return len * len;
//
//
//    }
//
//    // 직사각형의 넓이를 구하는 기능
//    public int calcArea02(int w, int h) {
//        return w * h;
//    }



    // 정사각형의 넓이를 구하는 기능
    // calcArea(int)
    public int calcArea(int len) {
        return len * len;
    }

    // 직사각형의 넓이를 구하는 기능
    // calcArea(int , int)
    public int calcArea(int w, int h) {
        return w * h;
    }
    // calcArea(double)
    public int calcArea(double advbas){
        return 0;
    }
    // calcArea(int , String)
    public int calcArea(int a,String b){
        return 0;
    }

    // calcArea(String , int )
    public int calcArea(String b,int a){
        return 0;
    }
    // calcArea(int , int , int )
    public int calcArea(int a,int b, int c){
        return 0;
    }
//    // calcArea(int)// 위에 똑같은게 있어서 안됨
//    public void calcArea(int a){
//        return 0;
//    }



}
