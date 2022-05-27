package programers.level1;

public class 평균_구하기 {

    public static double solution(int[] arr) {

        int[] s = arr;

        double sum = 0;
        for (int i = 0; i <s.length ; i++) {
            sum += s[i];
        }

        //System.out.println(sum);
      //  System.out.println(sum/s.length);

        return sum/s.length;
    }

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3});
    }
}
