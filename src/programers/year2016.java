package programers;

public class year2016 {


    public static String solution(int a, int b) {

        int month = a;
        int day = b;
        int k = 0;
        int sum ;
        String answer = "";
        if (month == 1) {
            k = 0;
        } else if (month == 2) {
            k = 31;
        } else if (month == 3) {
            k = 31 + 29;
        } else if (month % 2 == 0) {
            k = (30 * month) + (int) ((double) (month / 2) - (double) 1);
        } else if (month % 2 == 1) {
            k = (30 * month) + (int) ((double) (month / 2) - (double) 1 / 2);
        }
        sum = k + day;

        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        if(sum % 7 == 0){
             answer = days[2];
        }
        else if (sum % 7 == 1) {
            answer = days[3];
        }
        else if (sum % 7 == 2) {
            answer = days[4];
        }
        else if (sum % 7 == 3) {
            answer = days[5];
        }
        else if (sum % 7 == 4) {
            answer = days[6]; // 월
        }
        else if (sum % 7 == 5) {
            answer = days[0]; // 화
        }
        else if (sum % 7 == 6) {
            answer = days[1]; // 수
        }

        return answer;

    }


    public static void main(String[] args) {

        System.out.println(solution(1, 1));


    }
}
