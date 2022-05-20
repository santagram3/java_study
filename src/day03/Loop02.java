package day03;

public class Loop02 {
    public static void main(String[] args) {

        apple: for (char upper = 'A'; upper <= 'Z'; upper++){
            for (char lower = 'a'; lower <='z'; lower++){
//                if(lower == 'f') break;// 제일 가까운 반복문을 탈출한다
                if(lower == 'f') break apple; //애플이라는 반복문을 바로 탈출한다
                System.out.printf("%c - %c\n",upper ,lower);
            }// inner for
//            if (upper == 'D')break;
        }// outer for
    }
}
