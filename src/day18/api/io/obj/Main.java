package day18.api.io.obj;

import java.io.*;
import java.util.ArrayList;

import java.util.*;


public class Main {

    static List<Human> humanList =new ArrayList<>();

    public static void main(String[] args) {
        humanList.add(new Human("김철수 ", 22,"서울시 구로구"));
        humanList.add(new Human("이칠수 ", 222,"서울시 감가구"));
        humanList.add(new Human("삼칠수 ", 52,"노로드 감가구"));



//        saveTxtFile();
    saveObject();
    }

    // 세이브 기능

    static void saveObject(){

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/Exercise/human.sav"))){

            oos.writeObject(humanList);
//            java.io.NotSerializableException: day18.api.io.obj.Human
//            직렬 화가 안된다고 7

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



    // 세이브 기능
    static void saveTxtFile(){

        try (FileWriter fw = new FileWriter("E:/exercise/human.txt")){

            StringBuilder sb = new StringBuilder();
            for (Human h : humanList) {
                fw.write(String.format("%s,%d,%s\r\n" , h.getName(),h.getAge(),h.getAddress()));
            }
            System.out.println(" 저장완료 ");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 로드 기능
    static void load(){



    }







}
