package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        System.out.println("# 변경전 정보 : [영웅재중 , 최강창민 ,시아준수 ,믹키유천 , 유노윤호]!!");
//        String[] member = {"영웅재중","최강창민","시아준수","믹키유천","유노윤호"};
        String[] member = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("변경 전 정보 : [\"영웅재중\", \"최강창민\", \"시아준수\", \"믹키유천\", \"유노윤호\"]");
        while (true) {
            System.out.println(" 수정할 맴버를 입력하세요 ");
            System.out.printf(">> ");
            String fixMember = sc.nextLine();
            String target = fixMember;

            // 탐색 알고리즘
            int index = -1; // 찾은 인덱스를 저장할 변수 // 인덱스중에 -1은 없으므로 일단 이렇게 저장
            for (int i = 0; i < member.length; i++) {
                if (target.equals(member[i])) {
                    index = i;
                    break;
                }
//                System.out.println("찾은 인덱스 :" + index);
            }
            if (index == -1) {
                System.out.printf("%s은(는) 없는 이름입니다. \n", fixMember);
                continue;
            } else {
                System.out.printf("%s의 별명을 변경합니다.", fixMember);
                System.out.printf(">> ");
                String fixedMember = sc.nextLine();
                member[index] = fixedMember;
                System.out.println("변경 완료!!");
                System.out.println("변경 후 정보 :" + Arrays.toString(member));
                break;
            }
        }
        sc.close();


    }

}