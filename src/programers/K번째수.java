package programers;

import java.awt.event.ItemEvent;
import java.util.Arrays;

public class K번째수 {

    public static int[] solution(int[] array, int[][] commands) {

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] temp1 = new int[arr2[0][1] - arr2[0][0] + 1];


//        temp1[0] = arr[1];
//        temp1[1] = arr[2];
//        temp1[2] = arr[3];
//        temp1[3] = arr[4];


        for (int a = arr2[0][0]-1; a < arr2[0][1]-1; a++) {
            for (int b = 0; b < temp1.length; b++) {
                temp1[b] = arr[a++];
            }
        }
        System.out.println(temp1[arr2[0][2]]);
        System.out.println(Arrays.toString(temp1));


        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        solution(arr, arr2);

    }
}