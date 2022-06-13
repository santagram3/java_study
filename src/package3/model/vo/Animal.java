package package3.model.vo;

public abstract class Animal {

    private String name;
    private String kinds;

    protected Animal() {
    }
    protected Animal(String name, String kinds) {
        this.name = name;
        this.kinds = kinds;
    }

    public abstract String speak();

    @Override
    public String toString() {
        return String.format("저의 이름은 %s이고 , 종류는 %s 입니다. ", name,kinds);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kinds;
    }

    public void setKind(String kinds) {
        this.kinds = kinds;
    }



}
