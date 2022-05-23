package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("###먹고싶은 음식을 입력하세요 ###");
        System.out.println("[입력을 중지하려면 <그만>이라고 입력하세요>]");

        String[] foodList = {};
        while (true) {

        System.out.printf(">>>");
        String food = sc.nextLine();

            if (food.equals("그만")) {
                System.out.println(Arrays.toString(foodList));
                break;
            } else {
                // 1. 원본 배열보다 사이즈가 1 큰 새로운 배열 생성
                String[] newFoodList = new String[foodList.length + 1];
                // 2 원본배열의 데이터를 새로운 배열에 복사
                for (int i = 0; i < foodList.length; i++) {
                    newFoodList[i] = foodList[i];
                }
//        3. 추가할 데이터를 마지막 인덱스에 추가
                String newData = food;
                newFoodList[newFoodList.length - 1] = newData;
//        4. 주소값 이전
                foodList = newFoodList;
                newFoodList = null;

            }
            sc.close();
        }
    }
}
