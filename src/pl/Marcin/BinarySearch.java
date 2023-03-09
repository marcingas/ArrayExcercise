package pl.Marcin;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres liczb z jakich chcesz losować liczbę?");
        int range = scanner.nextInt();
        int[] numbers = new int[range];
        Arrays.setAll(numbers, index -> index + 1);
        System.out.println(Arrays.toString(numbers));

        int initialIndex = 0;
        int endIndex = numbers.length - 1;
        int middleIndex = (endIndex + initialIndex) / 2;

        System.out.println("Wartość ostatniego indeksu =" + numbers[endIndex]);
        System.out.println("Wartość zerowego indeksu =" + numbers[initialIndex]);
        System.out.println("Wartość środkowego indeksu =" + numbers[middleIndex]);
//        System.out.println("Wartość 11 indeksu =" + numbers[11]);

        System.out.println("Podaj liczbę całkowitą z zakresu 1 -" + range);
        int searchedNumber = scanner.nextInt();
        searchBinaryWithWhile(range, searchedNumber, numbers);
        searchBinaryWithFor(range, searchedNumber, numbers);

        //zadanie 1 przygotowanie do Binary Search:
//        if (numbers[middleIndex] == searchedNumber) {
//            System.out.println("Znaleziono liczbę: " + searchedNumber);
//        } else if (numbers[middleIndex] > searchedNumber) {
//            endIndex = middleIndex;
//            middleIndex = (endIndex + initialIndex) / 2;
//            System.out.println("Szukana wartość znajduje się w lewej połowie tablicy");
//            System.out.println("Middle index = " + middleIndex);
//        } else {
//            initialIndex = middleIndex + 1;
//            middleIndex = (endIndex + initialIndex) / 2;
//            System.out.println("szukana wartość znajduje się w prawej połowie tablicy");
//            System.out.println("Middle index = " + middleIndex);
//        }
    }

    public static void searchBinaryWithFor(int range, int searchedNumber, int[] array) {
        int initialIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex = (endIndex + initialIndex) / 2;
        for (int i = 0; i < endIndex; i++) {
            if (array[middleIndex] == searchedNumber) {
                System.out.println("Znaleziono liczbę " + array[middleIndex]);
                return;
            } else if (array[middleIndex] > searchedNumber) {
                System.out.println("middleINdex = " + middleIndex);
                endIndex = middleIndex;
                middleIndex = (endIndex + initialIndex) / 2;
            } else {
                System.out.println("middleIndex = " + middleIndex);
                initialIndex = middleIndex + 1;
                middleIndex = (endIndex + initialIndex) / 2;
            }
        }
    }

    public static void searchBinaryWithWhile(int range, int searchedNumber, int[] array) {

        int initialIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex = (endIndex + initialIndex) / 2;
        boolean found = false;
        while (!found) {
            if (array[middleIndex] == searchedNumber) {
                System.out.println("Znaleziono liczbę " + array[middleIndex]);
                found = true;
            } else if (array[middleIndex] > searchedNumber) {
                System.out.println("middleINdex = " + middleIndex);
                endIndex = middleIndex;
                middleIndex = (endIndex + initialIndex) / 2;

            } else {
                System.out.println("middleIndex = " + middleIndex);
                initialIndex = middleIndex + 1;
                middleIndex = (endIndex + initialIndex) / 2;
            }
        }
    }
}
