package datastructure.chap02.linkedlist.doubly;

public class Main {

    public static void main(String[] args) {


    DoublyLinkedList list =  new DoublyLinkedList();
    list.add(4);
    list.add(5);
    list.add(7);
    list.add(8);
    list.add(-11);
    list.add(13);
    list.add(46);
    list.add(485);

        System.out.println(list.printList());

        list.remove(-11);
        list.remove(485);
        System.out.println(list.printList());
    }




}
