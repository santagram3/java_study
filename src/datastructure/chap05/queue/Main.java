package datastructure.chap05.queue;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();

        // 큐에 자료 넣기
        for (int i = 1; i <= 5; i++) {
            queue.add(i*3);
        }
        // 큐에 모든 자료를 삭제하면서 출력

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        System.out.println("==============");









    }
}
