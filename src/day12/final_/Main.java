package day12.final_;

public class Main {


    public static void main(String[] args) {
        Korean park = new Korean("박철수" ,"119948-1151209" ,"대한민국");
        Korean kim1 = new Korean("김영희" ,"123484-2051259", "콩고민주공화국");
        Korean kim2 = new Korean("김일희" ,"123484-2051259","대만");
        Korean kim3 = new Korean("김이희" ,"123484-2051259","일본");

        park.name ="박찬호 ";
//        kim.id = "1q213412-15142411" ;
//        kim.nation = "중국";

        System.out.println(park);
        System.out.println(kim1);
        System.out.println(kim2);
        System.out.println(kim3);

    }
}
