public class App {
    private static final int TAMANHO_SEQUENCIA = 10;

    public static void main(String[] args) {
        System.out.println("Sequência de Fibonacci de tamanho " + TAMANHO_SEQUENCIA + ":");

        for (int i = 0; i < TAMANHO_SEQUENCIA; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
        System.out.print("\n");
    }

    public static int calcularFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}