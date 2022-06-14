package day15.inter;

public class Main {

    public static void main(String[] args) {

 //  인터페이스도 다형성을 적용할 수있다.
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Shark shark = new Shark();
//        Tiger tiger = new Tiger();
//        BullDog bullDog = new BullDog();
//        Rabbit rabbit = new Rabbit();
        // 원본



        Pet dog = new Dog();
        Pet cat = new Cat();
        Shark shark = new Shark();
        Violent tiger = new Tiger();
        BullDog bullDog = new BullDog();
        Rabbit rabbit = new Rabbit();

        Pet[] pets = {dog ,cat ,bullDog,rabbit};
        for (Pet pet : pets) {
            pet.Play();
        }

        Violent[] violents = {rabbit,shark,tiger};
        for (Violent v : violents) {
            v.attack("사람");
        }

        // 인터페이스를 통해 객체의 기능을 제한 할 수 있다.
        // 바이오렌트같은 인터페이스는 금방이다
       Violent tokki = new Rabbit();
//        tokki.Play();
        tokki.attack("주인");





    }
}
