package pl.Marcin;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Arrays.setAll(numbers, index -> index + 1);
        System.out.println(Arrays.toString(numbers));

        int initialIndex = 0;
        int endIndex = numbers.length - 1;
        int middleIndex = (endIndex + initialIndex) / 2;

        System.out.println("Wartość ostatniego indeksu =" + numbers[endIndex]);
        System.out.println("Wartość zerowego indeksu =" + numbers[initialIndex]);
        System.out.println("Wartość środkowego indeksu =" + numbers[middleIndex]);
//        System.out.println("Wartość 11 indeksu =" + numbers[11]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą z zakresu 1-10");
        int searchedNumber = scanner.nextInt();
        if (middleIndex == searchedNumber) {
            System.out.println("Znaleziono liczbę: " + searchedNumber);
        } else if (middleIndex > searchedNumber) {
            endIndex = middleIndex;
            middleIndex = (endIndex + initialIndex) / 2;
            System.out.println("Szukana wartość znajduje się w lewej połowie tablicy");
            System.out.println("Middle index = " + middleIndex);
        } else {
            initialIndex = middleIndex + 1;
            middleIndex = (endIndex + initialIndex) / 2;
            System.out.println("szukana wartość znajduje się w prawej połowie tablicy");
            System.out.println("Middle index = " + middleIndex);
        }
    }
}
