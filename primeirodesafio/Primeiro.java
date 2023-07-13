package primeirodesafio;

import java.util.Scanner;

public class Primeiro {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLines = scanner.nextInt();
        int[] values = new int[numLines];

        for (int i = 0; i < numLines; i++) {
            values[i] = scanner.nextInt();
        }

        int maxValue = 0;
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        int[] counts = new int[maxValue + 1];
        for (int value : values) {
            counts[value]++;
        }

        for (int i = 0; i <= maxValue; i += 2) {
            for (int j = 0; j < counts[i]; j++) {
                System.out.println(i);
            }
        }

        for (int i = maxValue % 2 == 0 ? maxValue - 1 : maxValue; i >= 1; i -= 2) {
            for (int j = 0; j < counts[i]; j++) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}