package com.kh.practice.chap02_abstractNInterface.model.vo;

import jdk.dynalink.beans.StaticClass;

public interface Phone {


    char[] NUMBERPAD = {'1','2','3','4','5','6','7','8','9','*','0','#'};

    String makeCall(); // 전화 걸기
    String takeCall(); // 전화 받기


}
