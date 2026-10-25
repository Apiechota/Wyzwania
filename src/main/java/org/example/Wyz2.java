package org.example;

public class Wyz2 {
    /* Aby hasło było wystarczająco bezpieczne, musi mieć określoną liczbę znaków i symboli specjalnych.
    W tym wyzwaniu utworzysz funkcję, która weryfikuje złożoność hasła.
    Aby hasło było ważne, musi składać się z co najmniej sześciu znaków, jednej wielkiej litery, jednej małej litery i jednej cyfry.
    Funkcja przyjmie ciąg jako dane wejściowe i wyświetli wartość logiczną, reprezentującą, czy hasło jest wystarczająco złożone.
     */
    public static boolean checkPassword(String password)
    {
        char c;
        boolean hasLowerCase=false,hasUpperCase=false,hasDigit=false;
        if(password.length()<6) return false;
        for(int i=0;i<password.length();i++) {
            c = password.charAt(i);
            if(Character.isDigit(c)) hasDigit=true;
            if (Character.isLowerCase(c)) hasLowerCase=true;
            if (Character.isUpperCase(c)) hasUpperCase=true;
        }


        return hasDigit&&hasLowerCase&&hasUpperCase;
    }
    static void main() {

        System.out.println(checkPassword("To jest moje nowe haslo 1234"));
    }
}
