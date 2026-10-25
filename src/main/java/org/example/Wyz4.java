package org.example;

public class Wyz4 {
 /*   - Czas obliczyć rachunek za wodę dla Twojego mieszkania. Twój rachunek za wodę składa się z dwóch części.
 Po pierwsze, minimalna opłata wynosi 18,84. Obejmuje to 1,496 galonów wody lub dwa CCF. Jeden CCF jest równy 748 galonom.
 Jeśli użyjesz więcej niż dwóch dołączonych CCF, zostaniesz obciążony dodatkową opłatą w wysokości 3.90 USD za dodatkowe CCF.
 Oznacza to, że jeśli zużyjesz 1800 galonów wody w danym miesiącu, zostaniesz obciążony opłatą w wysokości co najmniej 18,84 USD,
 a także dodatkowymi 3,90 USD za dodatkową ilość zużytej wody. Dla uproszczenia w tych obliczeniach nie uwzględniamy podatku.
  */

    static double minPrice=18.84;
    static double CCF=748;
    static double priceExtraCCF=3.90;

    public static double calculateBill(double galons)
    {
        double price;
        if(galons>2*CCF)
            return minPrice+Math.ceil((galons-(2*CCF))/CCF)*priceExtraCCF;
        return minPrice;
    }

    static void main() {

        System.out.println(calculateBill(1000));

    }
}
