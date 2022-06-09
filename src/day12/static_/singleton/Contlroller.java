package day12.static_.singleton;

import day08.modi.Pac2.C;

public class Contlroller {


    public int number;

    // 2. 필드로 객체를 딱 하난 생성시키는데
    // static제한을 걸어서 공유 객체로 전환
    private static Contlroller con;
    static {
        con = new Contlroller();
    }

    // 1. 단 하나의 생성자에 private 제 한을 걸어
    // 외부에서 직접적으로 객체를 생성할수 없도록 제한

    private Contlroller(){

    }

    // 3. 준비돈 단 하나의 객체를 public메서드를 통해 제공
    public static Contlroller getInstance(){
        if (con != null) return con;
        return new Contlroller();
    }


}
