package day17.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            array.add(i);
            linked.add(i);
        }

        long s, e; // 시작시간, 끝시간

        // 배열리스트에서 데이터 제어
        s = System.currentTimeMillis();
        int len = array.size();
        for (int i = 0; i < len; i++) {
//            array.remove(0);
//            배열리스트 소요시간: 656ms
            array.get(i);
//            배열리스트 소요시간: 0ms
        }
        e = System.currentTimeMillis();
        System.out.printf("배열리스트 소요시간: %dms\n", e - s);

        // 연결리스트에서 데이터 제어
        s = System.currentTimeMillis();
        len = linked.size();
        for (int i = 0; i < len; i++) {
//            linked.remove(0);
//            연결리스트 소요시간: 0ms
            linked.get(i);
//            연결리스트 소요시간: 3636ms
        }
        e = System.currentTimeMillis();
        System.out.printf("연결리스트 소요시간: %dms\n", e - s);


    }
}