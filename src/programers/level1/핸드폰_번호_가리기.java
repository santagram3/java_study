package programers.level1;

public class 핸드폰_번호_가리기 {

    public static String solution(String phone_number) {
        String answer = phone_number;
        // 폰 넘버
        String num = "";
        // 별 을 담을 변수
        String last4 = answer.substring(phone_number.length()-4);
//         끝 4자리를 담을 변수
        for (int i = 0; i < phone_number.length()-4; i++) {
            //별의 갯수 만큼 포 문 돌리기
            num += "*";
        }
        //System.out.println(last4);
       // System.out.println(num +last4);
        return num+last4;

    }

    public static void main(String[] args) {
        System.out.println(solution("01059164111"));
    }
}