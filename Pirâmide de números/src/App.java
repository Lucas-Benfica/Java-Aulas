public class App {
    public static void main(String[] args) throws Exception {
        int altura = 5;

        for(int i =1; i <= altura; i++){
            for(int j=1; j<= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
