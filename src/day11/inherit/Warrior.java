package day11.inherit;


import utility.Util;

// 자식 클래스 (sub class)
public class Warrior extends Player{


    public int rage;// 분노게이지

    public Warrior(String name){
        super(name);
        // super(); // 부모의 생성자 호출 생략됨  // Player();
        this.rage = 0;
        System.out.println("Warrior 생성자 호출!");
    }


    // 내가한거 밑에꺼는 선생님이 한거

//    public void rush(Player... a) {
////        if(a instanceof Player == this.name){
//            for (int i = 0; i <a.length ; i++) {
//                int rn = (int)(10*(Math.random())+20);
////                System.out.printf("%s님이 %d의 피해를 입으셨습니다.(남은체력 %d)\n" ,a[i].name,rn,a[i].hp-rn);
//                Util.line();
//                System.out.printf("%s님이 %s님에게 FireRush를 시전하셨습니다\n ",this.name,a[i].name);
//                System.out.printf("%s님이 %d의 피해를 입으셨습니다 \n",a[i].name,rn);
//                System.out.printf("%s님의 현재 체력은 %d 입니다\n",a[i].name,a[i].hp-rn);
//
//            }
//
////        System.out.println(name + "님이 돌진합니다.");
//    }


    public void rush(Player target) {
        System.out.printf("%s님이 %s님에게 FireRush를 시전했습니다!\n"
                , this.name, target.name);
        int damage;
        String job;
        if (target instanceof Warrior) {
            damage = 10;
            job = "전사";
        } else if (target instanceof Mage) {
            damage = 20;
            job = "마법사";
        } else if (target instanceof Hunter) {
            damage = 15;
            job = "사냥꾼";
        } else {
            damage = 0;
            job = "미확인";
        }
        target.hp -= damage;
        System.out.printf("%s(%s)님이 %d의 피해를 입었습니다.\n"
                , target.name, job, damage);
        System.out.printf("%s님의 현재 체력: %d\n"
                , target.name, target.hp);
        System.out.println();
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
