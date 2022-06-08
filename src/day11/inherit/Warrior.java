package day11.inherit;


// 자식 클래스 (sub class)
public class Warrior extends Player{


    public int rage;// 분노게이지

    public Warrior(String name){
        super(name);
        // super(); // 부모의 생성자 호출 생략됨  // Player();
        this.rage = 0;
        System.out.println("Warrior 생성자 호출!");
    }


    public void rush() {
        System.out.println(name + "님이 돌진합니다.");
    }

    @Override// 오버라이딩 룰 체크
    public void showStatus(){ //2. 접근제한을 더 강화해서 오버라이딩할 수 없음 // public
//        System.out.println("\n========== chararter's info ============");
//        System.out.println("name = " + name);
//        System.out.println("level = " +level);
//        System.out.println("hp = " + hp);
        super.showStatus(); // 부모의 기본값을 가져옴
        System.out.println("rage = " + rage);
    }














}
