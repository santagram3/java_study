package day10.encap;

public class Car {

    private String model;// 모델명
    private int speed;// 현재속도
    private char mode; // 변속모드 (D , N ,R ,P)
    private boolean start; // 시동 온 오프 상태

    public Car(String model) {
        this.model = model;
        this.mode = 'p';

    }

    // setter : 필드값 변경을 대리하는 메서드
    public void setSpeed(int speed){
        if(speed <0 || speed >200){
            return;
        }
        this.speed = speed;
    }

    // getter : 은닉된 필드값을 참조하는 메서드
    public int getSpeed(){
        return this.speed;
    }

    public void setMode(char mode){
        switch (mode){
            case 'D': case 'N' :case 'R' :case 'P' :
                this.mode = mode;
                break;
            default:
                this.mode = 'p';
        }
    }
    public char getMode(){
        return this.mode;
    }


}
