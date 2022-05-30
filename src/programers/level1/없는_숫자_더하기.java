package programers.level1;

public class 없는_숫자_더하기 {

    public static int solution(int[] numbers) {
        int[] arr = numbers;
        int total = 45;
        int minus = 0;
        for (int i = 0; i < arr.length ; i++) {

             minus +=arr[i];
        }

        return total - minus;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }

}
