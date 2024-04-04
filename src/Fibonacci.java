public class Fibonacci {
    int[] serieFibonacci;

    public Fibonacci(int TAMANHO) {
        this.serieFibonacci = new int[TAMANHO];
        calculaFibonacci(TAMANHO);
    }

    private void calculaFibonacci(int TAMANHO) {
        serieFibonacci[0] = 1;
        serieFibonacci[1] = 1;

        for (int index = 2; index < TAMANHO; index++) {
            serieFibonacci[index] = serieFibonacci[index - 2] + serieFibonacci[index - 1];
        }
    }

    public void exibirFibonacci() {
        for (int num: serieFibonacci) {
            System.out.print(num + " ");
        }
    }
}
