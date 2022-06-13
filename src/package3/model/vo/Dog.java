package package3.model.vo;

public class Dog extends Animal {

    public static final String PLACE; // 애견카페

    private int weight ;
    static {
        PLACE = "애견카페";
    }


    public Dog() {

    }

    public Dog(String name, String kind, int weight) {
        super(name, kind);
        this.weight = weight;
    }

    @Override
    public String speak() {
       return super.toString() + "몸무게는 " + weight + " kg 입니다.";

    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
