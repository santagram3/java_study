package datastructure.chap05.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 백준 2164번
public class Queue_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        sc.close();
        for (int i = 0; i < N; i++) {
            A[i] = i + 1;
        }


        Queue<Integer> que = new LinkedList<>();

        for (int i = 0; i < A.length; i++) {
            que.add(A[i]);
        }
//        System.out.println(que.toString()); //잘 들어왔고

        while (que.size() > 1) {
            // 1. 삭제하고
            que.poll();

            // 2. 위에있는걸
            int removed = que.poll();
            que.add(removed);

        }

        int last = que.peek();
        System.out.println(last);

    }


}
