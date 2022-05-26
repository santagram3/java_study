package com.kh.example.practice1.model.vo;

public class Member {


    String memberId;
    String memberPwd;
    String memeberName;
    int age;
    char gender;
    String phone;
    String email;

    public Member( ){}

    public void changeName (String name){
        memeberName = name;
    }
   public void printName(){
       System.out.printf("이름 : %s\n" , memeberName);
   }


}

