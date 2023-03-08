package desafio;

public class Distribuidora3 {
    public static void main(String[] args) {

        double[] vetor = {2500.0, 3100.0, 1700.0, 2200.0, 2900.0,
                3200.0, 2100.0, 2800.0, 2400.0, 2600.0, 3000.0, 3300.0,
                2800.0, 3400.0, 2700.0, 2900.0, 3200.0, 2500.0, 3100.0,
                2800.0, 3000.0, 2000.0, 2300.0, 1900.0, 1800.0, 2600.0,
                3300.0, 2800.0, 3000.0, 2900.0, 3400.0};

        double menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }



        double maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }


        // Calcula a média mensal de faturamento
        double media = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            media += vetor[i];
        }
        media /= vetor.length;

        // Conta o número de dias em que o faturamento diário foi superior à média mensal
        int acimaDaMedia = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                acimaDaMedia++;
            }
        }

        System.out.println("Menor faturamento diário: " + menor);
        System.out.println("Maior faturamento diário: " + maior);
        System.out.println("Dias com faturamento acima da média mensal: " + acimaDaMedia);

    }

}

