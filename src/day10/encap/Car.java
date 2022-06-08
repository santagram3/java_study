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

    // 시동 거는 기능
    public void engineStart(){
        System.out.println("시동버튼을 눌렀습니다.");
        injectOil();
        injectGasoline();
        this.start = true;
        moveCylinder();
        System.out.println("시동이 걸렸습니다.");

    }
    // 엔진에 연료가 주입되는 기능
    private void injectGasoline(){
        System.out.println("연료가 엔진에 주입욉니다.");
    }
    // 엔진오일이 주입되는 기능

    private void injectOil(){
        System.out.println("엔진 오일이 순환합니다.");
    }
    // 실린더가 움직이는 기술
    private void moveCylinder(){
        if(start){
            System.out.println("실린더가 움직입니다.");
        }
        else {
            System.out.println("차가 고장났습니다.");

        }


    }


// 시동을 끄는 기능

    public void engineStop(){
        if (this.speed > 0){
            System.out.println("주행중에는 시동을 끌 수가 없어요");
            return;
        }
        this.start = false;
        System.out.println("시동이 꺼졌습니다.");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }
}
