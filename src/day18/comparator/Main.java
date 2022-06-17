package day18.comparator;

import day11.protec.pac1.A;

import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {


        List<Person> Plist = new ArrayList<>();
        Plist.add(new Person("송철수", 23));
        Plist.add(new Person("가ㄴ수", 12));
        Plist.add(new Person("나ㄷ수", 42));
        Plist.add(new Person("다철수", 52));

        // 나이 순으로 오름차 정렬 (나이 적은 순)
//        Plist.sort(new AgeAscendingComparator());

        // 나이 오름차
        Plist.sort((o1, o2) -> o1.getAge() - o2.getAge());

        // 나이 내림차
        Plist.sort((o1, o2) -> o2.getAge() - o1.getAge());


        // 이름 오름차
//        Plist.sort(new NameAsCendingComparator());

//        Plist.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        // 이름 오름차
        Plist.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));


        for (Person p : Plist) {
            System.out.println(p);
        }


    }
}
