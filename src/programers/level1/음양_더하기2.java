package programers.level1;

public class 음양_더하기2 {

    public static int solution(int[] absolutes, boolean[] signs) {

        int[] nums = {4,7,12};
        boolean[] arr = {true,false,true};

        long total = 0;
        for (int i = 0; i <absolutes.length ; i++) {
            // 부호가 붙은 원래 숫자
            int n = signs[i] ? absolutes[i] : -absolutes[i];
            total += n;
        }
        return (int)total;

        /*
                총 합을 저장할 변수
                for(absolutes 배열의 크기만큼) {
                signs 배열의 논리값을 확인하여
                absolutes배열의 정수값에 부호를 붙인다음
                총합에 누적
                }

        */
    }




    public static void main(String[] args) {




    }




}
