package com.company.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFileCaseStudy {
    public static void main(String[] args) throws IOException {

        Stream<String> rowData = Files.lines(Paths.get(System.getProperty("user.dir") + "/" + "salesdata.csv"));
        //System.out.println(rowData);

        //Get only those data which has sales info
        //Cheese,8000,2020 ->[Cheese,8000,2020]
        // int totalRows = (int) rowData.map(x->x.split(",")).filter(arr->arr.length>2).count();
        //System.out.println(totalRows);

        //get all pizza names which have some sales data
        /*List<String[]> arrayOfSalesRowData = rowData.map(x -> x.split(",")).filter(arr -> arr.length > 2).collect(Collectors.toList());
        for (String[] arrData : arrayOfSalesRowData) {
            System.out.println("Pizza name : " + arrData[0] + ",sales : " + arrData[1] + ", in year : " + arrData[2]);
        }*/


        //Key - value pair
        //Categorization of sales data for every pizza type
        //{"Cheese":"8000", "Veggie":"7000", "Pepperoni":"5000", "Margherita":"2000"}

        /*Map<String,String> salesMap = rowData.map(row->row.split(",")).filter(r->r.length>2).collect(Collectors.toMap(x->x[0], y->y[1]));
        System.out.println(salesMap);*/
        //same as 33 line but in Integer parse
        /*Map<String,Integer> salesMap1 = rowData.map(row->row.split(",")).filter(r->r.length>2).collect(Collectors.toMap(x->x[0], y->Integer.parseInt(y[1])));
        System.out.println(salesMap1);
        System.out.println("Sales of Margherita : "+salesMap1.get("Margherita"));*/

        //Find the total sales for all pizza of year specified
        Optional<Integer> optTotalSales = rowData.map(x->x.split(",")).filter(arr->arr.length>2).map(y->Integer.parseInt(y[1])).reduce((a, b)->a+b);
        System.out.println("Total sales data for year 2020 : "+optTotalSales.get());



    }
}
