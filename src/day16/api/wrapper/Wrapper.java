package day16.api.wrapper;

public class Wrapper {

    public static void main(String[] args) {

        int a = 22;
        Object[] arr = {10, 2.2, a};
        Integer n = 10;// 오토 박싱
//        int m = n.intValue();
        int m = n; // 오토 언 박싱

// int 의 초기값은 0 이고
//        Integer 의 초기값은 null 이다
        System.out.println(Integer.MAX_VALUE);

        // 초기값을 널로 잡고싶으면 Integer


    }

}
