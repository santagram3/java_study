package day08.player;

public class Main {

    public static void main(String[] args) {

        Player park = new Player("박찬호", 1, 50);
        Player kim = new Player("김철수", 1, 50);

        park.attack(kim);
        park.attack(kim);
        kim.attack(park);
        park.attack(park);
        kim.attack(kim);


    }
}
