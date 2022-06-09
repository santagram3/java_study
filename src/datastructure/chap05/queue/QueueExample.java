package datastructure.chap05.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        // 자바에서 제공하는 api
        // 큐 생성

        Queue<Integer> que = new LinkedList<>();

        // 큐에 데이터 넣기

        for (int i = 1; i <=5 ; i++) {
            que.add(i*3);
        }
//        3 6 9 12 15
        // 큐의 사이즈 제공
        System.out.println("저장된 개수 : " + que.size()); // 5

        // 큐에서 하나 삭제
        int removed = que.poll(); // 앞에서 하나 제거  // 3
        System.out.println("removed = " +removed); // 3

        // 큐 전체보기
        System.out.println(que.toString()); // 배열로 보기

        // 전체삭제 하면서 삭제되는거 프린트하기
        while (!que.isEmpty()){
            System.out.println(que.poll());
        }
        // 전체보기
        System.out.println("===========");
        System.out.println(que);







    }

}
