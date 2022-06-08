package com.kh.hw.person.controller;

public class test {

    public static void main(String[] args) {
        PersonController pc;
        pc = new PersonController();
        pc.personCount();
        System.out.println(pc.personCount()[0]); // // 잘 나옴
        System.out.println(pc.personCount()[1]); // 얘는 까왜 2 일 ?
        System.out.println(pc.personCount()[2]); // 이건 안나오는게 맞다 .. 배열의 길이가 2 이니까
        pc.insertStudent("박봉길",12,17.5,15.0,2,"화학과");
        System.out.println(pc.personCount()[0]); // //

    }
}
