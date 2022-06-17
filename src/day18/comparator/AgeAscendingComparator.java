package day18.comparator;


import java.util.Comparator;

// Person의 나이 오름차 정렬을 위한 비교 객체
public class AgeAscendingComparator implements Comparator<Person> {

        // 첫번째 o1과 두번째 o2가 같다면 0 리턴
        // o1이 o2 보다 앞에가게 하려면 음수를 리턴
        // o1이 o2 보다 뒤에 가게 하려면 양수를 리턴


    @Override
    public int compare(Person o1, Person o2) {
//        if(o1.getAge() < o2.getAge()) return -1;
//        else if (o1.getAge() == o2.getAge()) return 0;
//        else return 1;
//
        return o1.getAge() - o2.getAge();
    }
}
