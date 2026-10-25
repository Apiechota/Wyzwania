package org.example;

import java.time.LocalDate;

public class Wyz5 {
    /* Chcesz stworzyć program, który będzie śledził Twoje postępy w osiąganiu
    celu w ciągu najbliższych 100 dni. W tym wyzwaniu zaczniesz pisać ten program, tworząc
    funkcję, która wyświetla dane, który dzień będzie za 100 dni. To będzie Twój dzień
    świętowania, w którym osiągniesz swój cel. Zachęcam Cię do zrobienia rozeznania
    i znalezienia wbudowanej biblioteki Java, która pomoże Ci w Twojej implementacji.
    Nie musisz tworzyć klasy Date od zera.
     */
    public static LocalDate for100Days(LocalDate date)
    {
        return date.plusDays(100);

    }
    public static void printDate()
    {
        LocalDate d=LocalDate.now();
        System.out.println(d);
        LocalDate d2=for100Days(d);
        System.out.println(d2);
    }
    static void main() {

        printDate();

    }
}
