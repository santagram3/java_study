package datastructure.chap02.linkedlist.singly;

public class test {

    public static void main(String[] args) {

        SimpleLinkedList<String> list = new SimpleLinkedList<>();


        list.addFirst("오징어");
        list.addFirst("문어");
        list.addFirst("쭈꾸미");
        list.addFirst("고라니");

        String s = list.printList();
        System.out.println(s);

        SimpleLinkedList<Double> dlist = new SimpleLinkedList<>();
        dlist.addFirst(3.5);
        dlist.addFirst(1.5);
        dlist.addFirst(2.5);
        dlist.addFirst(5.5);
        dlist.addFirst(6.5);

        String d = dlist.printList();
        System.out.println(d);


    }
}
