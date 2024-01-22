import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        int numeroInteiro = 10; // Numeros inteiros sem ponto ou vírgula
        String nome = "Tipagem em Java"; // Sequência de caracteres qualquer
        double valorDaCompra = 18.20; // Valores com ponto flutuante
        boolean temPermissao = true; // Sempre true ou false
        
        //System.out.println(nome);

        List<String> meuArrayInfinito = new ArrayList<>(); // Criando o array

        int i = 0;
        while( i < 5 ){
            String valorAtual = "Minha posição no array é: " + i;
            meuArrayInfinito.add(valorAtual);
            i++;
        }
        System.out.println(meuArrayInfinito.get(2)); //Pegando um item do array

        // Para saber o tamanho da minha lista
        // meuArrayInfinito.size();

        // Serve para encontrar o índice a partir do valor
        // meuArrayInfinito.indexOf("Valor");

        // Verifica se o array está vazio
        // meuArrayInfinito.isEmpty();

        // Saber se na lista existe determinado valor
        // meuArrayInfinito.contains("Valor");

        // Limpa a lista
        // meuArrayInfinito.clear();
    }
}
