package day12.static_;

public class Main {

    public static void main(String[] args) {

        System.out.println(Count.y);
        // static 은 오직 하나의 값만 존재하기때문에
//        c1.y = c2.y = count.y; 이렇게 같다
        // 오직 하나이기 때문에 Count.y 로 부를수 있다.

        Count c1 = new Count();
        Count c2 = new Count();


        c1.x = 10;
        c1.x++;
        c1.y = 20;
        c1.y--;
        System.out.printf("c1.x : %d c1.y : %d\n",c1.x,c1.y);
        System.out.printf("c2.x : %d c2.y : %d\n",c2.x,c2.y);
        c2.x = 100;
        Count.y = 200;
        System.out.printf("c1.x : %d c1.y : %d\n",c1.x,c1.y);
        System.out.printf("c2.x : %d c2.y : %d\n",c2.x,c2.y);


        System.out.println("==========================");



    }
}
