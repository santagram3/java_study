package day17.collection.list;

import java.util.*;

public class ListExample {


    public static void main(String[] args) {

//        public class LinkedList<E>
//                extends AbstractSequentialList<E>
//                implements List<E>, Deque<E>, Cloneable, java.io.Serializable
//  이런  구조를 가지고있다


//        배열 리스트 생성 - 초기 생성시 10개 공간이 주어지고
//                데이터 추가시 동적으로 늘어남
        List<String> sList = new ArrayList<>(); // 배열리스트 생성

        // add(E e) : 리스트의 맨 끝에 객체를 추가
        sList.add("멍멍이");
        sList.add("야옹이");
        sList.add("짹짹이");
        sList.add("뚜꺼비");
        sList.add("야옹이");
        sList.add("개굴이");
        sList.add("호랑이");

//        sList.toString();
        System.out.println(sList);

        // size() : 저장된 객체의 수
        int size = sList.size();
        System.out.println("size = " + size);

        // add(int index , E e) : 데이터 중간 삽입
        // 야옹이와 짹짹이 사이에 넣으려면
        sList.add(2, "어흥이");
        System.out.println(sList);

        // set(index ,obj) : 객체 수정
        sList.set(3, "바뀐 메롱이");
        System.out.println(sList);

        // remove(index), remove(obj)
        sList.remove(1);// 1번인덱스 지워 // 야옹이 사라짐
        System.out.println(sList);
        sList.remove("개굴이"); // 개굴이 지워
        System.out.println(sList);

        // get(index) : 객체 참조 

        String s = sList.get(2);
        System.out.println("s = " + s);


        // indexOf(obj) : 저장된 객체의 인덱스를 리턴 ,없으면 -1
        int idx = sList.indexOf("어흥이");
        System.out.println("idx = " + idx);

        // contains(obj) : 객체의 저장 유무 확인
        boolean flag = sList.contains("두까비");
        System.out.println("flag = " + flag);

        System.out.println("=================");

        for (int i = 0; i < sList.size(); i++) {
            System.out.println(sList.get(i));
        }

        System.out.println("===================");

        for (String s1 : sList) {
            System.out.println(s1);
        }
        // clear() : 리스트 내부 전체 삭제
        System.out.println(sList);
        sList.clear();
        System.out.println(sList);
        sList.size();
        boolean empty = sList.isEmpty();
        System.out.println("empty = " + empty);


        // 초기값을 가진 리스트
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(10, 20, 30, 5, 8, 56, 2)
        );

        System.out.println(numbers);

//        Integer[] objects = (Integer[]) numbers.toArray();


        // 오름차 정렬
        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

        //[2, 5, 8, 10, 20, 30, 56]


        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);
        //[56, 30, 20, 10, 8, 5, 2]

        // 2차원 리스트
        List<List<Integer>> list2d = new ArrayList<>();
        // 2차원 리스트에 1차원 리스트를 추가
        list2d.add(new ArrayList<>(Arrays.asList(10, 20, 30)));
        list2d.add(new ArrayList<>(Arrays.asList(40, 50, 60)));
        list2d.add(new ArrayList<>(Arrays.asList(70, 80, 90)));

        // 2차원 리스트 1번째 1차원리스트에 정수 추가
//        list2d.get(0).add(10);

        System.out.println("========================");
        for (List<Integer> list : list2d) {
            for (int n : list) {
                System.out.printf("%d ", n);
            }
            System.out.println();
        }

    }


}
