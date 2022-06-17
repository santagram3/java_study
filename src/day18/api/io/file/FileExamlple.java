package day18.api.io.file;

import java.io.*;

public class FileExamlple {

public static final String ROOT_PATH = "E:/Exercise";

    public static void main(String[] args) {

        // 폴더 생성
        File dir = new File( ROOT_PATH+"/Dir/hello");

        // 폴더 생성 명령
        if(!dir.exists())dir.mkdirs(); // 경로에 있는 모든 가지들을 다 만든다
//        mkdir = E:/Exercize/Dir/가 있다는 가정하에 hello 만 만든다

        // 파일 생성
        File file1 = new File( ROOT_PATH+"/file1.txt");
        File file2 = new File( ROOT_PATH+"/file2.txt");
        File file3 = new File( ROOT_PATH+"/file3.txt");

        try {

        if(!file1.exists()) file1.createNewFile();
        if(!file2.exists()) file2.createNewFile();
        if(!file3.exists()) file3.createNewFile();
        } catch (IOException e){
            e.printStackTrace(); // 이거 잘 모르겠음..
        }

        // 폴더 파일 정보 읽기
        File exercise = new File( ROOT_PATH);

        File[] files = exercise.listFiles();

        for (File f : files) {
            if(f.isDirectory()){
                System.out.printf("Directory - 폴더명  :$s\n" , f.getName());
            }
            else {
                System.out.printf("File - 파일명 : %s / 크기 : %d\n", f.getName(),f.length());
            }
        }





    }
}
