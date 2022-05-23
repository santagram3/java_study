package day04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        String[] pets = {"멍멍이", "짹짹이", "삐약이"};
        // 1. 원본 배열과 사이즈가 같은 새 배열을 하나 더 생성
        String[] petsCopy = new String[pets.length];

        System.out.println("원본배열 주소:" + pets);
        System.out.println("복사배열 주소:" + petsCopy);

//        2. 원본 배열에 저장된 값들을 하나하나씩 사본배열로 복사
//        fori 단축키
        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }
//        petsCopy[0] = pets[0];
//        petsCopy[1] = pets[1];
//        petsCopy[2] = pets[2];


        pets[0] = "야옹이";
        petsCopy[2] = "어흥이";


        System.out.println("원본배열 :" + Arrays.toString(pets));
        System.out.println("복사배열 :" + Arrays.toString(petsCopy));

    }
}
