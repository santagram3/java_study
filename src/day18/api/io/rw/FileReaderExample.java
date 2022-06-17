package day18.api.io.rw;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader("E:/Exercise/dog.txt")) {
            int data ; // 인트가 왜 나오지 ?
            while ((data = fr.read()) !=-1){
                System.out.print((char)data);
            }

        } catch (FileNotFoundException e){

        } catch (IOException e ){

        }
    }


}
