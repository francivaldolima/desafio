package desafio;

public class Mensal4 {
    public static void main(String[] args) {

        double SP =  67836.43, RJ = 36678.66,MG = 29229.88, ES = 27165.48, Outros = 19849.53;

        double total  = SP +  RJ + MG + ES + Outros;


        double totalSp = (SP * 100) / total;
        double totalRj = (RJ * 100) / total;
        double totalMg = (MG * 100) / total;
        double totalEs = (ES * 100) / total;
        double totalOutros = (Outros * 100) / total;

        System.out.println("Percentual de representação do estado SP: " + String.format("%.2f",totalSp) + "%");
        System.out.println("Percentual de representação do estado RJ: " + String.format("%.2f",totalRj) + "%");
        System.out.println("Percentual de representação do estado MG: " + String.format("%.2f",totalMg) + "%");
        System.out.println("Percentual de representação do estado ES: " + String.format("%.2f",totalEs) + "%");
        System.out.println("Percentual de representação do estado Outros: " + String.format("%.2f",totalOutros) + "%");
    }
}
