package com.kh.hw.member;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class test {

    public static void main(String[] args) {




        MemberController mc = new MemberController();

//        mc.searchId("ttt"); // 이러면 안나옴
//        System.out.println(mc.searchId("ttt"));
//        // 리턴 받아서 나와야 함

        Member[] members = mc.searchName("박영희");
        for (Member m : members) {
            System.out.println(m.inform());
        }


    }
}
