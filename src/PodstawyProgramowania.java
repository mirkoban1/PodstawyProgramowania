package com.company;

public class PodstawyProgramowania {
    public static String pierwszaMetoda(){
        String costam = "costam";
        return costam;
    }

    public static Double dodawanie(Integer a, Double b) {
        return a+b;

    }

    public static void main(String[] args) {
        System.out.println("Pierwszy znak");

        String pierwszy = "Nowy string";
        Character Singleletter = 'c';

        //zmienne liczbowe
        Integer liczba1 = 1;
        Float liczba2 = 1.67f;
        Double liczba3 = 2.56;

        // na czarno definicja typu zmiennej

        System.out.println(pierwszaMetoda());
        System.out.println("Liczba "+ liczba1+" liczba "+liczba3+ " wynosi "+ dodawanie(liczba1, liczba3));



    }
}
