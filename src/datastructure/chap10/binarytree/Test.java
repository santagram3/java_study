package datastructure.chap10.binarytree;

import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {


        BinaryTree tree = new BinaryTree();

        /*
                               50
                27                              68
        12              36              55              82
    7      19      **       49      **      **      76      **

         */
        tree.add(50);
        tree.add(27);
        tree.add(68);
        tree.add(12);
        tree.add(36);
        tree.add(55);
        tree.add(82);
        tree.add(7);
        tree.add(19);
        tree.add(49);
        tree.add(76);

        tree.preOrder(tree.getRoot());
        System.out.println("\n=========");

        tree.inOrder(tree.getRoot());
        System.out.println("\n=========");

        tree.postOrder(tree.getRoot());
        System.out.println("\n=========");

        System.out.println("\n================");
        Node found = tree.find(33);
        System.out.println(found);

        System.out.println("==================");
        tree.add(3);
        tree.add(100);
        Node Max = tree.findMax();
        System.out.println("Max = " + Max);
        Node min = tree.findMin();
        System.out.println("min = " + min);

        System.out.println("================트리 출력===========");

        tree.display();

        tree.delete(36);
        tree.display();

        tree.delete(50);
        tree.display();

        // 트리의 문제점

         BinaryTree tree2 = new BinaryTree();

         tree2.add(50);
        tree2.add(42);
        tree2.add(30);
        tree2.add(20);

        System.out.println("========이진트리의 문제점 ==================");
        tree2.display();

        System.out.println("================API 트리 사용======================");

        // TreeSet : Set형태로 Tree를 구현
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(56);
        treeSet.add(77);
        treeSet.add(27);
        treeSet.add(7);
        treeSet.add(67);

        System.out.println(treeSet);

        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("멍멍이",30);
        treeMap.put("강아지",50);
        treeMap.put("고양이",20);
        treeMap.put("악어",49);
        treeMap.put("슝이",58);

        System.out.println(treeMap);





    }

}
