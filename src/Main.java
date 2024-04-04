import fibonacci.Fibonacci;
import front.Interface;
import numeros.Numeros;
import sistemaAcademico.Alunos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 3;
        Scanner scanner = new Scanner(System.in);

        do {
            Interface.menu(
                    "Fibonacci",
                    "Sistema Academico",
                    "Números"
            );

            System.out.println("\nInforme uma das opções acima: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    final int TAMANHO = 30;
                    Fibonacci fibonacci = new Fibonacci(TAMANHO);
                    fibonacci.exibirFibonacci();
                    break;
                case 2:
                    final int TAMANHO_ALUNOS = 10;
                    Alunos alunos = new Alunos(TAMANHO_ALUNOS);
                    do {
                        Interface.menu(
                                "Pedir Notas",
                                "Gerar Notas Aleatórias",
                                "Exibir Notas",
                                "Calcular Média",
                                "Quantidade de Notas Abaixo e Acima da Média",
                                "SAIR");

                        System.out.println("\nInforme uma das opções acima: ");
                        opcao = scanner.nextInt();

                        switch (opcao) {
                            case 1:
                                alunos.pegarNotas(TAMANHO_ALUNOS, scanner);
                                break;
                            case 2:
                                alunos.gerarNotasAleatorias(TAMANHO_ALUNOS);
                                break;
                            case 3:
                                alunos.listarNotas();
                                break;
                            case 4:
                                double media = alunos.calcularMedia();
                                System.out.println("A média dos estudantes é: " + media);
                                break;
                            case 5:
                                int[] abaixoAcima= alunos.contarNotasMenoresMaioresDaMedia();
                                System.out.printf(
                                        "Abaixo da média: %d\nAcima da média: %d\n",
                                        abaixoAcima[1], abaixoAcima[0]);
                                break;
                        }
                    } while (opcao != 6);

                    break;
                case 3:
                    Numeros numeros = new Numeros(scanner);
                    System.out.println(
                            "\nNúmeros digitados: " + numeros.quantidadeNumerosDigitados() +
                            "\nMédia dos números: " + numeros.mediaNumerosDigitados()
                    );
                    break;
            }
        } while (opcao < 4);

    }
}