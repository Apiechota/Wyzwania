package org.example;

public class Wyz1 {
    /*
    [Instruktor] Liczba jest nawet wtedy, gdy jest podzielna przez dwa, co oznacza, że po podzieleniu przez dwa nie ma reszty.
    W tym wyzwaniu utworzysz funkcję, która sprawdzi, czy liczba jest parzysta. Jeśli liczba jest parzysta, funkcja powinna zwrócić
    wartość true. Jeśli jest nieparzyste, funkcja powinna zwrócić wartość false. Dane wejściowe zawsze będą podawane w liczbach całkowitych.
    */
    public static boolean isEven(int liczba)
    {
        if (liczba%2==0)
            return true;
        else
            return false;
    }
    static void main() {

        System.out.println(isEven(10));
    }
}
