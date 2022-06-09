package day12.static_.singleton;

public class main {

 public static void main(String[] args) {
  // 3개가 static 으로 묶여서 단 하나의 객체로 만들어짐
 Contlroller c1 = Contlroller.getInstance();
 Contlroller c2 = Contlroller.getInstance();
 Contlroller c3 = Contlroller.getInstance();

 c1.number = 100;
 c2.number = 200;
 c3.number = 300;


  System.out.println("c1 = " + c1.number);
  System.out.println("c2 = " + c2.number);
  System.out.println("c3 = " + c3.number);



 }
}
