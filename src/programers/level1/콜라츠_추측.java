package programers.level1;

public class 콜라츠_추측 {

    public static int solution(int num) {


        long n = num ;
        int count = 0;
        while (n > 1){
            if (n % 2 == 0){
                n /= 2;
                count++;

            }
            else if ((n % 2) == 1){
                n *= 3;
                n ++;
                count++;

            }
            if (count > 500 ){
                count = -1;
                break;
            }
//            System.out.printf("count : %d  , n : %d\n" , count , n);


        }
        return count ;

    }


    public static void main(String[] args) {

        System.out.println(solution(626331));// -1


    }
}
