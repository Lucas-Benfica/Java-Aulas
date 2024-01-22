import java.util.Scanner;

// Uma forma de receber informações pelo console é criando um scanner 

public class App {
    public static void main(String[] args) {
        
        // Criando um Scanner para receber a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        String resposta = "";

        // Solicitando ao usuário que insira um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificando se o número é par ou ímpar
        if (numero % 2 == 0) {
            resposta = numero + " é par";
        } else {
            resposta = numero + " é ímpar";
        }

        // Verificando se o número é positivo, negativo ou zero
        if (numero > 0) {
            resposta += " e positivo.";
        } else if (numero < 0) {
            resposta += " e negativo.";
        } else {
            resposta += " e é zero.";
        }

        System.out.println(resposta);

        // Fechando o Scanner
        scanner.close();

    }
}
