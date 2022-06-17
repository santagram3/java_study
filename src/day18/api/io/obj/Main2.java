package day18.api.io.obj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {

    static List<Human> humanList = new ArrayList<>();

    public static void main(String[] args) {
//        loadTextFile();
        loadObject();
        for (Human h : humanList) {
            System.out.println("h = " + h);
        }

    }


    static void loadObject() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/Exercise/human.sav"))){

            // 다운캐스팅 해야됨
           humanList =(List<Human>) ois.readObject();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }


    // 텍스트 파일 불러와서 리스트에 넣기 

    static void loadTextFile() {

        try (BufferedReader br = new BufferedReader(new FileReader("E:/Exercise/human.txt"))) {

            String s = "";
            while ((s = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(s, ",");
                Human human = new Human(st.nextToken(), Integer.parseInt(st.nextToken()), st.nextToken());
                humanList.add(human);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}


