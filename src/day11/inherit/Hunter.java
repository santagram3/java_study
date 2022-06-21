package day11.inherit;

public class Hunter extends Player {


    public int arrow; // 화살수

    public Hunter(String name) {
        super(name);
//        부모에서 가져온 정보
//        this.name = name;
//        this.level = 1;
//        this.hp = 50;
        this.arrow = 1000;
    }


    public void blazeShot() {
        System.out.println(name + "님이 폭발 화살을 시전합니다.");
    }

    @Override// 오버라이딩 룰 체크
    public void showStatus() { //2. 접근제한을 더 강화해서 오버라이딩할 수 없음 // public
//        System.out.println("\n========== chararter's info ============");
//        System.out.println("name = " + name);
//        System.out.println("level = " +level);
//        System.out.println("hp = " + hp);
        super.showStatus(); // 부모의 기본값을 가져옴
        System.out.println("arrow = " + arrow);
    }


}
