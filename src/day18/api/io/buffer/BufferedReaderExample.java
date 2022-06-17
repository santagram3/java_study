package day18.api.io.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {


    public static void main(String[] args) {
        // Buffered ~~ 는 보조 스트림 이므로  핵심기능을 하는 스트림가 결합해야 합니다.
//        BufferedReader() 의 괄호안에 reader타입을 넣어야 한다  = InputStreamReader() 넣어야 하고
        // 여기 괄호엔 인풋스트림을 넣어야한다
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            String s = br.readLine();
            System.out.println(s);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
