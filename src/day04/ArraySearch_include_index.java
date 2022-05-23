package day04;

public class ArraySearch_include_index {
    public static void main(String[] args) {

        // 배열 탐색 알고리즘

        // 인덱스 찾기 , 유무 확인

        String[] foods = new String[] {"치킨", "피자", "삼겹살", "파스타"};
        String target = "삼겹살";

        int index = -1; // 찾은 인덱스를 저장할 변수 // 인덱스중에 -1은 없으므로 일단 이렇게 저장

        for (int i = 0; i < foods.length; i++) {
            if(target.equals(foods[i])){
                index = i;
                break;
            }

         }//end for


        System.out.println("찾은 인덱스 :"+index);

        boolean hasFood = index != -1;
        System.out.println("존재유무 : " + hasFood);


    }
}
