package pl.Marcin;

import java.util.Arrays;

public class ArrayFirstTask {
    public static void main(String[] args) {
        //zad 1:
        String [] array = new String[11];
        array[0] = "jeden";
        array[1] = "dwa";
        array[2] = "trzy";
        array[3] = "cztery";
        array[4] = "pięć";
        array[5] = "sześć";
        array[6] = "siedem";
        array[7] = "osiem";
        array[8] = "dziewięć";
        array[9] = "dziesięć";
        array[10] = "jedenaście";

        System.out.println(Arrays.toString(array));
        //zad 2:
        Long [] numbers = new Long[100];
        Arrays.fill(numbers,0,10,1L);
        Arrays.fill(numbers,10,30,2L);
        Arrays.fill(numbers,30,50,3l);
        Arrays.fill(numbers,50,80,4l);
        Arrays.fill(numbers,80,100,5l);
        System.out.println(Arrays.toString(numbers));
        //zad 5: tablica zeroelementowa:
        String[]a = {};
        System.out.println(Arrays.toString(a));
        //zad 6:
        String[] goal = {"corner","player"};
        //zadanie 7 i 8 : w tablicy możemy przechowywać typy prymitywne oraz referencyjne typy proste są przechowywane
        // jako wartości a typy referencyjne jako referencje do obiektów.
    }
}
