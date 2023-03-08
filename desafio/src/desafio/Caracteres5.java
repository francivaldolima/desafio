package desafio;

public class Caracteres5 {
    public static void main(String[] args) {

        String nome = "futebol";
        int tamanho = nome.length();
        tamanho = tamanho-1;



        for(int i=0; i < nome.length(); i++){
            nome.charAt(tamanho);
            System.out.print(nome.charAt(tamanho));
            tamanho--;

        }
    }
}
