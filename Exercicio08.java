import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número total de eleitores");
        int totalEleitores = in.nextInt();

        System.out.println("Digite o número de votos válidos");
        int votosValidos = in.nextInt();

        System.out.println("Digite o número de votos brancos");
        int votosBrancos = in.nextInt();

        System.out.println("Digite o número de votos nulos");
        int votosNulos = in.nextInt();

        float percentValidos = (votosValidos * 100) / totalEleitores;
        System.out.printf("O percentual de votos válidos é %f%% \n", percentValidos);

        float percentBrancos = (votosBrancos * 100) / totalEleitores;
        System.out.printf("O percentual de votos brancos é %f%% \n", percentBrancos);

        float percentNulos = (votosNulos * 100) / totalEleitores;
        System.out.printf("O percentual de votos nulos é %f%% \n", percentNulos);
    }
}