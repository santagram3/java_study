package com.stackjoin;

import com.kh.hw.member.model.vo.Member;
import com.stackjoin.*;

public class Account {

   private Stock[] ac =  new Stock[SIZE];

    private Person saram = new Person();
    public static final int SIZE = 10;

    public Account() {
        ac[0] = new Stock("에너지 ETF",15.6, 15000 ,12);
        ac[1] = new Stock("비트코인 ETF",15.6, 15000,55);
        ac[2] = new Stock("메타버스 ETF",15.6, 15000,33);
        ac[3] = new Stock("전기차 ETF",15.6, 15000,16);
        ac[4] = new Stock("친환경 ETF",15.6, 15000,5);
    }


    // ========================매서드 ========================================================
    public int existStock() {
        int count = 0; // 실제 가지고있는 주식 갯수
        for (Stock ac : ac) {
            if (ac == null) break;
            count++;
        }
        return count;
    }

    // 보유 주식 리턴
    public Stock[] printAll() {
        return ac;
    }


    // 주식이름으로 주식 인덱스 찾기
    public int findIndexByStock(String stockName) {
        int index = -1;
        for (int i = 0; i < existStock(); i++) {
            if (stockName.equals(ac[i].getStockName())) {
                index = i;
                break;
            }
        }
        return index;
    }

    //주식을 배열 ac에 넣는(사는) 메서드
    public void buyStock(String stockName,double updownRate ,double price ,int pieces) {

        if(saram.getCash() < price*pieces) {
            System.out.printf("%s 주식을 사시려면 %f이 모자랍니다 ",stockName,(price*pieces)-(saram.getCash()));
            return;
        }

        int count = existStock();
        ac[count] = new Stock(stockName, updownRate , price ,pieces);
        System.out.printf("%s님은 %s주식을 %f어치 사셨습니다. \n남은 잔액은 %f원입니다"
                ,saram.getMyName() ,stockName,pieces*price, saram.getCash()-price*pieces );
    }


    //주식을 배열 ac에 빼는(파는) 메서드
    public void sellStock(String stockName ,double price ,int pieces){
        // 일단 내가 가지고있냐 없냐

        // 확인절차 1. 이름으로 확인하기
        int index = findIndexByStock(stockName);
        if (index == -1){
            System.out.printf("%s은 보유하고있는 주식이 아닙니다.",stockName);
            return;
        }

        Stock stock = ac[index]; //

        // 확인절차 2. 가지고있는 갯수로 확인하기
        if (stock.getPieces() < pieces) {
            System.out.printf("팔수있는 %s주식의 보유수량이 모자랍니다.",stockName);
        }

       stock.setPieces(stock.getPieces() - pieces);// 가지고있는주식 / 초기화 / 가지고있는주식 - 팔고싶은 주식수
        System.out.printf("%s님은 %s을 %f에 매도하셨습니다 " +
                "\n 현재 남은 %s주식 수는 %d주 입니다",
                saram.getMyName(),stockName,price,stockName,stock.getPieces());





        // 있으면 파는데 .. 얼마만큼 팔아야되냐 .. ?
        // 팔긴 파는데 .. 16개중에 8개만 팔고싶으면 어떻게 하지 ..?





    }


























}
