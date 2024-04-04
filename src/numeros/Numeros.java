package numeros;

import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {
    ArrayList<Integer> numeros;

    public Numeros(Scanner scanner) {
        this.numeros = new ArrayList<>();
        pedirNumeros(scanner);
    }

    private void pedirNumeros(Scanner scanner) {
        int num;

        do {
            System.out.println("Informe um número: ");
            num = scanner.nextInt();
            if (num >= 0) this.numeros.add(num);
        } while (num >= 0);
    }

    public int quantidadeNumerosDigitados() {
        return numeros.size();
    }

    public double mediaNumerosDigitados() {
        double soma = 0;

        for (double num: numeros) {
            soma += num;
        }

        double media = soma / quantidadeNumerosDigitados();
        return Math.round(media * 100.0) / 100.0;
    }
}
