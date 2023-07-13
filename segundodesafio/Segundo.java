package segundodesafio;

import java.util.Scanner;

public class Segundo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = scanner.nextDouble();

        int cents = (int) (value * 100);

        System.out.println("NOTAS:");

        int[] notes = {10000, 5000, 2000, 1000, 500, 200};
        for (int note : notes) {
            int qnt = cents / note;
            cents %= note;
            System.out.printf("%d nota(s) de R$ %.2f\n", qnt, note / 100.0);
        }

        System.out.println("MOEDAS:");

        int[] coins = {100, 50, 25, 10, 5, 1};
        for (int coin : coins) {
            int qnt = cents / coin;
            cents %= coin;
            System.out.printf("%d moeda(s) de R$ %.2f\n", qnt, coin / 100.0);
        }

        scanner.close();
    }
}
