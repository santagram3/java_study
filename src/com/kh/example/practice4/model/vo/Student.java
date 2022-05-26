package com.kh.example.practice4.model.vo;

public class Student {

    int grade; // 학년
    int classroom; // 학급
    String name; // 이름
    double height; // 키
    char gender; //성별

    public Student() {
    }
 /// 정보를 받아서 초기화
    public Student(int g, int c,
                   String n, double h,
                   char ge) {
        grade = g;
        classroom = c;
        name = n;
        height = h;
        gender = ge;
    }

    // 호출하면 나오는 메서드
    public void information() {
        System.out.printf("%d학년 %d반 %s 정보: 키 - %.2fCM, 성별 - %c\n"
                , grade, classroom, name, height, gender);
    }

}
