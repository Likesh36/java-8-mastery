package com.company.interfaceenhancement.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Trading {

    static ArrayList<Stock>stocks=new ArrayList<>();

    //Stock stock =null;

    public static void main(String[] args){

        //Stock stockToSearch = new Stock("Hyundai",963,72);
        Stock stockToSearch = new Stock("Alphabet",549,36);

        stocks.add(new Stock("Apple",369,27));
        stocks.add(new Stock("Alphabet",549,36));
        stocks.add(new Stock("Meta",459,45));
        stocks.add(new Stock("Samsung",972,54));

        Predicate<Stock> stockEquality = Predicate.isEqual(stockToSearch);

        for(Stock s : stocks){
            if(stockEquality.test(s)){
                System.out.println("Stock found : "+s);
            }
        }

    }
}
