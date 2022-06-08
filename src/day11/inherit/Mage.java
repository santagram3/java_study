package day11.inherit;

public class Mage extends Player {

    public int mana; // 마력 게이지

    public Mage(String name) {
        super(name);
        this.mana = 100;
    }



    public void blizzard() {
        System.out.println(name + "님 눈보라 마법 시전!");
    }

    @Override// 오버라이딩 룰 체크
    public void showStatus(){ //2. 접근제한을 더 강화해서 오버라이딩할 수 없음 // public
//        System.out.println("\n========== chararter's info ============");
//        System.out.println("name = " + name);
//        System.out.println("level = " +level);
//        System.out.println("hp = " + hp);
        super.showStatus(); // 부모의 기본값을 가져옴
        System.out.println("mana = " + mana);
    }


}