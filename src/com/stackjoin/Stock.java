package com.stackjoin;

public class Stock {


    private String stockName; // 주식이름
    private double updownRate; // 등락률
    private double price ; // 가격 ,
    private int pieces ; // 갯수


    private double purchase;// 갯수 * 가격



    public Stock() {
    }

    public Stock(String stockName, double updownRate, double price, int pieces) {
        this.stockName = stockName;
        this.updownRate = updownRate;
        this.price = price;
        this.pieces = pieces;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getUpdownRate() {
        return updownRate;
    }

    public void setUpdownRate(double updownRate) {
        this.updownRate = updownRate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPurchase() {
        return price*pieces;
    }

    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }
    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }


}
