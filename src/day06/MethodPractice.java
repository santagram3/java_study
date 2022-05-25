package day06;

import java.util.Arrays;

public class MethodPractice {


    // 배열에 마지막 위치에 데이터를 추가하는 함수
    static void push(String newFood) {
        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }

        temp[temp.length - 1] = newFood;
        // 마지막에 새로운 음식을 넣어준다
//        temp[temp.length -1 ] //템프에 [템프길이 -1] = 템프에 [마지막 idx]
        foods = temp;
        temp = null;

    }

    // 배열 내부데이터  출력함수
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static int indexOf(String target) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                index = i;
                return index;
            }
        }
        return index;
    }

    static void remove(String target) {

        int index = -1;
        int i;
        for (i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                index = i;
            }
        }

        for (int j = i; j < foods.length; j++) {
            foods[j] = foods[j + 1];
        }
        String[] temp = new String[foods.length-1];
        for (int t = 0; t <foods.length-1 ; t++) {
            temp[t] = foods[t];
        }
        foods = temp;
        temp = null;

    }


    static String[] foods = {"떡볶이", "치킨", "파스타"};

    public static void main(String[] args) {


        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

//        // idx에 2가 리턴되어야 함
//        int idx = indexOf("파스타");
//        //파스타를 입력하면 인덱스 idx 가 2 가 나와야함
//        // idx에 4가 리턴되어야 함
//        int idx2 = indexOf("김치찌개");
//        // idx에 -1가 리턴되어야 함
//        int idx3 = indexOf("짜장면");

        int idx = indexOf("파스타");
        System.out.println(idx);
        int idx2 = indexOf("김치찌개");
        System.out.println(idx2);
        int idx3 = indexOf("짜장면");
        System.out.println(idx3);


        remove("김치찌개"); // foods배열에서 김치찌개 제거
        System.out.println(Arrays.toString(foods));
//        remove("망고"); // 존재하지 않는 음식명입니다 출력.
//
//        boolean flag = include("파스타"); // 파스타 발견시 true 리턴
//        boolean flag2 = include("양념치킨"); // 양념치킨 미발견시 false 리턴
//
//        insert(3, "파인애플"); // 3번 인덱스에 파인애플 삽입
//        modify(2, "닭갈비");  // 2번 인덱스 데이터 닭갈비로 수정
//        clear();  // foods배열 모든 데이터 삭제


    }
}
