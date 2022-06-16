package day17.collection.set;

import java.util.*;


//
public class SetExample {

    public static void main(String[] args) {

        // set :중복저장을 허용하지않는다
        // 데이터 삽입속도가 빠름 , 순서없이 저장

        Set<String> set = new HashSet<>();

        // add(E e) : 객체 추가
        set.add("김말이");
        set.add("닭꼬치");
        set.add("떡볶이");
       boolean b1 =  set.add("김말이");
       boolean b2 = set.add("김밥");

        System.out.println(set.size()); // 4
        // 김말이를 2개 넣어서 알아서 걸러줌

        System.out.println(set);
//        [김밥, 김말이, 닭꼬치, 떡볶이]
        //순서대로 막 넣어서 결과가 이렇게 나옴
        System.out.println("==============================");
        
        System.out.println("b1 = " + b1); // false
        System.out.println("b2 = " + b2); // true

        System.out.println("==============================");

        // set 루프처리

        for (String s : set) {
            System.out.println(s);
        }

        // remove(obj) : 객체 삭제
        set.remove("단무지"); // 없으면 안지워짐
        set.remove("닭꼬치"); 
        System.out.println(set);

        set.clear();                      // 다 지우기
        System.out.println(set.isEmpty()); // 비어있는지 확인 

        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(2,2,3,4,5,5,5,6,6,7,7,8,9,9,0)
        );
        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numbers);
        System.out.println(numberSet);
        System.out.println("==============");
        numbers.clear();
        numbers.addAll(numberSet);
        System.out.println(numbers);







    }


}
