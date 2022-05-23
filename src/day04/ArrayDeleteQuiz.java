package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        String[] member = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("우리반 학생들의 별명 : [\"영웅재중\", \"최강창민\", \"시아준수\", \"믹키유천\", \"유노윤호\"]");
        while (true) {
            System.out.println(" 삭제할 별명을 입력하세요 ");
            System.out.printf(">> ");
            String delMember = sc.nextLine();
            String target = delMember;

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
                System.out.printf("%s은(는) 없는 이름입니다. \n", delMember);
                continue;
            } else {

                int delIdx = index;
                //뒤에있는걸 앞으로 덮어 씌우기
                for (int i = index; i < member.length-1; i++) {
                        member[i] = member[i+1];
                }
//
                System.out.println("덮어씌우기 배열 :" + Arrays.toString(member));
                 //덮어씌우기 배열 :[영웅재중, 시아준수, 믹키유천, 유노윤호, 유노윤호]
                // 교체할 배열 만들기
                String[] temp = new String[member.length-1];

                // 원래 배열보다 1 작은 새로운 배열에 , 원래 배열 끼워 넣기
                for (int i = 0; i < member.length-1; i++) {
                    temp[i] = member[i];
                }
                System.out.println("temp 배열 :" + Arrays.toString(temp));
                
                member = temp; 
                temp = null;
                
                System.out.printf("%s의 별명을 삭제합니다.\n", delMember);
                
                System.out.println("삭제후 별명 :" + Arrays.toString(member));

//                System.out.println("삭제 완료!!");
//                System.out.println("삭제 후 정보 :" + Arrays.toString(member));
                break;
            }
        }
        sc.close();


    }

}