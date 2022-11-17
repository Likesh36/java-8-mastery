package com.company.interfaceenhancement.predicates;

public class Stock {
    String name;
    Integer stockPrice;
    Integer stockQly;

    public Stock(String name, Integer stockPrice, Integer stockQly) {
        this.name = name;
        this.stockPrice = stockPrice;
        this.stockQly = stockQly;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ",Stock Price: " + this.stockPrice + ",StockQuality: " + this.stockQly;
    }

    @Override
    public boolean equals(Object object) {
        Stock stock = (Stock) object;

        if (name.equals(stock.name) && stockPrice.equals(stock.stockPrice) && stockQly.equals(stock.stockQly)) {

            //if(name.equals(stock.name) && stockPrice==stock.stockPrice && stockQly==stock.stockQly){
            return true;
        } else {
            return false;
        }
    }
}
