package day11.inherit;

import utility.Util;

public class Mage extends Player {

    public int mana; // 마력 게이지

    public Mage(String name) {
        super(name);
        this.mana = 100;
    }




//    public void blizzard(Player... a) {
//            Util.line();
//        System.out.println(name + "님 눈보라 마법 시전!");
////        if(a instanceof Player == this.name){
//        for (int i = 0; i <a.length ; i++) {
//       int rn = (int)(10*(Math.random())+5);
//            System.out.printf("%s님이 %d의 피해를 입으셨습니다.(남은체력 %d)\n" ,a[i].name,rn,a[i].hp-rn);
//        }
//    }

    public void blizzard(Player... targets) {
        System.out.printf("# %s님 눈보라 시전!!!!\n", this.name);
        System.out.println("======================================");


        for (Player p : targets) {
            //맞은 사람이 혹시 나??
            if (p == this) continue;

            //10 ~ 15의 랜덤 피해
            int damage = (int) (Math.random() * 6 + 10);
            //실제 체력에서 차감
            p.hp -= damage;
//            p.setHp(p.getHp() - damage);

            System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
                    , p.name, damage, p.hp);
        }
    }
//    public void blizzard(Player a,Player b,Player c) {
//        System.out.printf("%s님이 11의 피해를 입으셨습니다.(남은체력 %d)\n" ,a.name,a.hp-11);
//        System.out.printf("%s님이 12의 피해를 입으셨습니다.(남은체력 %d)\n" ,b.name,b.hp-12);
//        System.out.printf("%s님이 11의 피해를 입으셨습니다.(남은체력 %d)\n" ,b.name,b.hp-11);
//        System.out.printf("%s %s %s\n",a,b,c);
//        System.out.println(name + "님 눈보라 마법 시전!");
//    }

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