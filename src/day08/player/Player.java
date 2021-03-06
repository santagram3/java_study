package day08.player;

public class Player {

    String name; // 닉네임
    int level;// 레벨
    int hp; // 체력

    // 생성자
    Player(){
        this("이름없음");
        System.out.printf("1번 생성자 ");
//        this.name = "이름없음";
//        this.level = 1;
//        this.hp = 50;
    }
    Player(String name){
        this(name ,1 ,50);
        System.out.println("2번 생성자 호출!");
//        this.name = name;
//        this.level = 1;
//        this.hp = 50;
    }
    Player(String name , int level ,int hp){
        System.out.println("3번 생성자 호출!");
        this.name = name;
        this.level = level;
        this.hp = hp;
    }




    void attack(Player target){

        if (this == target){
            System.out.println("자 해 하 지 마 세 요 ");
            return;
        }
        // 출력메세지 : x 가 y를 공격합니다.
        System.out.printf("%s가 %s를 공격합니다\n",this.name ,target.name);
        // 상대방의 체력을 10 낮추고 나의 체력을 5 회복하고싶어

        target.hp -=10 ;
        this.hp += 5;
        System.out.printf("나의체력 : %d 상대방체력 : %d \n" , this.hp , target.hp);

    }

    // 캐릭터 정보 출력 메서드

    void info(){
        System.out.printf("이름 : %s , 레벨 : %d , 체력 : %d \n" ,name ,level,hp);
    }




}
