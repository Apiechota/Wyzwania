package org.example;

import java.util.Random;
import java.util.Scanner;

public class Wyz3 {
    /* Tradycyjnie, zasada "podwójne albo nic" polega na podwojeniu lub anulowaniu długu, ale nasza gra będzie działać trochę inaczej.
    Użytkownik zaczyna z 10 punktami, a przez całą grę ma możliwość skorzystania z szansy podwojenia swoich punktów lub odejścia z aktualną
    wartością punktową. Jeśli użytkownik zdecyduje się zaryzykować swoje punkty w szansie na podwojenie. Program powinien wykorzystywać losowość,
    aby zdecydować, czy punkty zostaną podwojone, czy użytkownik straci wszystko.
     */
    static int points=10;
    static Random r=new Random();
    public static void gameLauch()
    {

        Scanner c=new Scanner(System.in);
        System.out.println("Grasz dalej?Tak/Nie");
        while(true) {
            if (c.nextLine().toUpperCase().equals("TAK")) {
                tryDoubles();
                if(points==0)
                {
                    System.out.println("Przegrałeś. Dzikeujemy za grę");
                    break;
                }
                System.out.println("Wygrałeś. Masz teraz "+points+" punktów.");
                System.out.println("Grasz dalej?Tak/Nie");

            }
            else
                break;
        }

    }

    private static void tryDoubles() {
        if(r.nextBoolean())
        points=points*2;
    else
        points=0;
    }

    static void main() {
        gameLauch();

    }

}
