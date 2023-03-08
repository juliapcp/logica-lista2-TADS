import java.util.Scanner;
// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
// porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
// Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
// escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o
// custo final ao consumidor.
public class Exercicio17 {
    public static void main(String[] args) {
        final float percentualDistribuidor = 28f;
        final float percentualImpostos = 45f;
        Scanner in = new Scanner(System.in);
        System.out.println( "Digite o custo de fábrica de um carro");

        float custoFabrica = in.nextFloat();
        float custoDistribuidor = custoFabrica * (percentualDistribuidor /100);
        float custoImpostos = custoFabrica * (percentualImpostos /100);
        float custoFinal = custoFabrica + custoDistribuidor+custoImpostos;
        System.out.printf("O custo final é R$:%.2f", custoFinal);
    }
}
