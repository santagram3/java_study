package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

    Student[] s = new Student[3];
    Employee[] e = new Employee[10];

    public PersonController() {
        s[0] = new Student("강건강", 20, 178.2, 70.0, 1, "정보시스템공학과");
        s[1] = new Student("남나눔", 21, 187.3, 80.0, 2, "경영학과");
        s[2] = new Student("강건강", 23, 167.0, 45.0, 4, "정보통신학과");
        e[0] = new Employee("박보배", 26, 180.3, 72.0, 100000000, "영업부");
        e[1] = new Employee("송성실", 38, 182.0, 76.0, 200000000, "기획부");
    }

    // 메소드 ~~~~~~~~~~~~~~~~~~~~~~~~
    public int[] personCount() {
        int count1 = 0; //
        int count2 = 0;
        int[] count3 = new int[2];
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null) {
                count1++;
            }
            else {
                break;
            }

        }
        for (int i = 0; i < e.length; i++) {
            if (e[i] != null) {
                count2++;
            }
            else{
                break;
            }
        }
        count3[0] = count1;
        count3[1] = count2;
        return count3;
    }

    public void insertStudent(String name, int age, double height, double weight, int grade, String major) {

        s[personCount()[0]+1] = new Student(name, age, height, weight, grade, major);
    }


}
