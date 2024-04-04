package sistemaAcademico;

import java.security.PublicKey;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Alunos {
    private double[] notasAlunos;

    public Alunos(int TAMANHO) {
        this.notasAlunos = new double[TAMANHO];
    }

    public void pegarNotas(int TAMANHO, Scanner scanner) {
        for (int index = 0; index < TAMANHO; index++) {
            System.out.printf("%dº nota: ", index + 1);
            notasAlunos[index] = scanner.nextDouble();
        }
    }

    public void gerarNotasAleatorias(int TAMANHO) {
        Random random = new Random();
        for (int index = 0; index < TAMANHO; index++) {
            double nota = 1 + random.nextDouble() * 9;
            this.notasAlunos[index] = Math.round(nota * 100.0) / 100.0;
        }
    }

    public void listarNotas() {
        System.out.print("\nNotas dos alunos: ");
        for (double nota: notasAlunos) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

    public Double calcularMedia() {
        double soma = 0;

        for (double nota: notasAlunos) {
            soma += nota;
        }

        double media = soma / notasAlunos.length;
        return Math.round(media * 100.0) / 100.0;
    }

    public int[] contarNotasMenoresMaioresDaMedia() {
        double media = calcularMedia();
        int acimaMedia = 0;
        int abaixoMedia = 0;

        for (double nota: notasAlunos) {
            if (nota > media) {
                acimaMedia++;
            } else if (nota < media) {
                abaixoMedia++;
            }
        }

        return new int[] {acimaMedia, abaixoMedia};
    }

    public void setNotasAlunos(double[] notasAlunos) {
        this.notasAlunos = notasAlunos;
    }

    public double[] getNotasAlunos() {
        return this.notasAlunos;
    }
}
