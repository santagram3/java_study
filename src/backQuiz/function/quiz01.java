package backQuiz.function;


public class quiz01 {


    static int sum(int[] a) {
       int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        sum(arr);
        System.out.println(sum(arr));

    }
}
