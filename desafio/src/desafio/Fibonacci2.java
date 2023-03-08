package desafio;

public class Fibonacci2 {
    public static void main(String[] args) {

        int numero = 35; // quantidade de números na sequência
        int primeiro = 0, segundo = 1, proximo;
        int achou = 0;

        System.out.print(primeiro + " " + segundo); // imprime os dois primeiros números

        for (int i = 3; i <= numero; i++) {
            proximo = primeiro + segundo;
            System.out.print(" " + proximo);
            primeiro = segundo;
            segundo = proximo;
            if(numero == proximo){
                achou = 1;
            }
        }

        System.out.println();

        if (achou == 1){
            System.out.println("pertence  a sequência.");
        }else{
            System.out.println("não pertence a sequência.");
        }
    }
}
