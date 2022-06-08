package com.kh.hw.member.model.vo;

public class Member {

    // 필드
    private String id ;
    private String name ;
    private String password ;
    private String email ;
    private char gender ;
    private int age;

    //===================== 생성자 -========================
    public Member() {

    }
    public Member(String id, String name, String password, String email, char gender, int age) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    // ============================메서드 =============================

    public String inform(){
        return String.format("%s %s %s %s %c %d",id,name,password,email,gender,age);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
