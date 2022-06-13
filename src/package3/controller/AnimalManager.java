package package3.controller;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {

    public static void main(String[] args) {

        Animal[] animals = new Animal[5];


        animals[0] = new Dog("멍멍이" ,"시고르자브종",24);
        animals[1] = new Dog("멍순이" ,"불독",12);
        animals[2] = new Cat("냥냥이","스코티시필드","서울","까만색");
        animals[3] = new Cat("냥순이","로드캣","대전","흰색");
        animals[4] = new Cat("호랑이","말자하","부산","삼색");

        for (int i = 0; i <animals.length ; i++) {

            System.out.println(animals[i].speak());
        }


    }
}
