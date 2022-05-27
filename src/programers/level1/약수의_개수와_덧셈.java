package programers.level1;

public class 약수의_개수와_덧셈 {

    public static int solution(int left, int right) {
        int count = 0;
        int sum = 0;
        for (int i = left; i < right + 1; i++) {
            // 숫자 범위 정하는 포문
            for (int j = 1; j < i + 1; j++) {
                // 1부터 범위 안에 i를 나눌 숫자 j 를 정해주는 포문
                if ((i % j) == 0) {
                    // 만약 left 를 1부터 j 로 나눴을때 나머지가 0 이라면
                    // j 는 i 의 약수 이므로
                    // 약수일때 count 에 ++ 를 해서 누적시킨다
                    // 누적시킨 count 값은 i의 약수의 갯수가 된다
                    count++;
                }
            }
//                System.out.println(count);
            if (count % 2 == 0) {
                // 약수의 갯수가 짝수라면 i를 sum에 더하고
                sum += i;
            } else if (count % 2 == 1) {
                // 약수의 갯수가 홀수면 i를 sum에 뺀다
                sum -= i;
            }
            // i가 1 증가하면 count를 초기화시켜준다
            count = 0;
        }
//        System.out.println(sum);
        return sum;
    }


    public static void main(String[] args) {

        System.out.println(solution(13, 17));
    }
}
