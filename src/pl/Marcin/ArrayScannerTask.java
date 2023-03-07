package pl.Marcin;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów Twojej nowej tablicy: ");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        int i = 0;
        while (i < numbers.length) {
            System.out.println("podaj liczbę dla kolejnego elementu tablicy:");
            numbers[i] = scanner.nextInt();
            i++;
        }
        System.out.println("wartość indeksu zerowego tablicy: " + numbers[0]);
        System.out.println("wartość indeksu ostatniego tablicy " + numbers[numbers.length - 1]);
        if (numbers.length % 2 == 0) {
            System.out.println("Tablica nie ma środowego indeksu, mogę podać wartość dla dwóch środkowych: " +
                    numbers[(numbers.length - 1) / 2] + "," + numbers[(numbers.length - 1) / 2 + 1]);
        }
        if (arrayLength % 2 != 0) {
            System.out.println("Wartość środkowego indeksu tablicy wynosi: " + numbers[numbers.length / 2]);
        }
    }
}
