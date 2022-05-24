package day05;

import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
//
//        System.out.print("권장 게임 인원 : 2 ~ 4 명 : ");
//
//        int n = sc.nextInt();// 게임인원 받기
//
//        sc.nextLine(); // 자동엔터 방지
//
//        String[] player = new String[n]; // 게임인원이 들어갈 배열
//
//        // 게임인원 입력 받기
//        for (int i = 0; i <n ; i++) {
//            System.out.printf("player %d 이름 :" ,i+1);
//            player[i] = sc.nextLine();
//        }
//        // 입력 받았는지 확인
//        System.out.println(Arrays.toString(player) + " 참 가 !");


        // 실탄 갯수 받기

        System.out.print("실탄 갯수 (1~5)개 :");

        int bullet = sc.nextInt();// 총알 갯수 받기

        sc.nextLine(); // 자동엔터 방지

        int[] gun = {-1,-1,-1,-1,-1,-1}; //총알이 들어갈 배열

//        // 총알 갯수 입력 받기
        for (int j = 0; j < bullet ; j++) {
            gun[j] = (int)(Math.random() * 6) + 1;
        }

        System.out.println(Arrays.toString(gun));




    }
}
