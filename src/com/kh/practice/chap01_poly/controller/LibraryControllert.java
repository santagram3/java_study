package com.kh.practice.chap01_poly.controller;


import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

import java.util.LinkedList;
import java.util.Queue;

public class LibraryControllert {

    private Member mem; // null로 명시초기화
    private Book[] bList;// 크기 5 할당

    public LibraryControllert() {
        mem = new Member();
        bList = new Book[5];
    }


    public void insertMember(Member mem) {
        this.mem = mem;
    }

    public Member myInfo() {
//        return mem;  dkslrh
        return this.mem;
    }

    public Book[] selectAll() {
        return this.bList;
    }

    public Book[] searchBook(String keyword) {

        Queue<Book>que = new LinkedList<>();

        for (int i = 0; i < bList.length; i++) {
            if (bList[i].getTitle().contains(keyword)) {
                que.add(bList[i]);
            }
        }
        Book[] books = new Book[que.size()];
        for (int i = 0; i < books.length ; i++) {
            books[i] = que.poll();
        }

        return books;

    }
    public int rentBook(int index){
        int result = 0;
        if (bList[index] instanceof AniBook){ // 애니북인지
            if (((AniBook)bList[index]).getAccessAge() <= mem.getAge()){
                result = 1;
            }
        } else if (bList[index] instanceof CookBook) {
            if (((CookBook)bList[index]).isCoupon() == true){
                result +=1;
            }
        }
        return result;
    }



}


//+ rentBook(index:int) : int



