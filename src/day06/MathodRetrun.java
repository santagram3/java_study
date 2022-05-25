package day06;

import java.util.Arrays;

public class MathodRetrun {

    //    2개의 정수를 더한 값을 주는 함수
    static int add(int n1, int n2) {
        return n1 + n2;
    }
//    2 개의 정수의 합을 출력하는 함수
    // void 빈공간 ,공허 ,
    // return 이 없는 함수는 void

    static void showAddResult(int n1, int n2) {
        System.out.printf("%d + %d = %d ", n1, n2, n1 + n2);
    }

    static void callName(String name) {
        if (name.length() > 5) {
            System.out.println("이름이 너무 길어 즐~~");
            return; // 함수 탈출문
        }
        System.out.printf("%s 하위~~\n", name);
    }

    /*
        모든 함수의 리턴값은 반드시 1개다.

        - 5개의 애완동물 이름목록에서 원하는 숫자슬 전달하면
        그 숫자만큼 랜덤으로 애완동물 리스트를 뽑아서 리턴하는 함수
     */

    static String[] selectPet(int count) {
        if(count<1 || count >5){
            return null;
        }

        String[] petList = {"멍멍이", "짹짹이", "꽥꽥이", "찍찍이", "뀌러기"};

        // 랜덤선택한 애완동물이 저장될 배열
        String[] selected = new String[count];
        for (int i = 0; i < count; i++) {
            int rn = (int) (Math.random() * petList.length);
            selected[i] = petList[rn];
        }
        return selected;

    }


    public static void main(String[] args) {

        add(10, 20);
//        System.out.println(n1 + n2); n1 ,n2 는 지역변수이기때문에
        // 밖에선 쓸수 없다

        int r1 = add(10, 20);
        System.out.println(r1);

        int r2 = r1 * 5 - 1;
        System.out.println(r2);

        // 리턴이 없는 void타입 함순느 변수에 저장할 수 없다.
        showAddResult(3, 5);

        System.out.println();

        double random = Math.random();

        add(add(10, 20), add(10, 55));
        // add(30,add(10,55))
        // add(30 , 65) = 95

        System.out.println("======================");

        callName("주차왕");
        callName("파       킹");
        callName("키키키키키키키");
        callName("하위하휘");
        callName("후위");

        System.out.println("======================");


        System.out.println(selectPet(3));

        String[] selectPet = selectPet(0);
        String[] selectPet2 = selectPet(2);
        System.out.println(selectPet);
        System.out.println(selectPet2);
        System.out.println(Arrays.toString(selectPet));
        System.out.println(Arrays.toString(selectPet2));



    }
}
