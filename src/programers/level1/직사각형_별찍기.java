package programers.level1;

import java.util.Scanner;

public class 직사각형_별찍기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력받기
        int a = sc.nextInt();// 가로
        int b = sc.nextInt(); // 세로

        for (int i = 0; i <b; i++) {
            // 세로 길이 정하기
            for (int j = 0; j <a; j++) {
                // 가로 길이 정하기
                System.out.print('*');
            }
            System.out.println();
            //칸 옮기기
        }
        // i = 0 = 첫번째줄 일때 // j를 a 만큼 별을 찍는다
        // 그러면 0번째줄에 a개의 별이 쌓인다 그러고
//        System.out.println(); 을 써서 칸을 옮긴다
        // 그러고 다시 i = 1 이 된다
//        그러고 위에 행동을 반복 하게되고 그러면
        // 가로는 a 세로는 b 별을 찍게 된다
    }

}
