
import java.util.Scanner;

// As maçãs custam R$ 1.50 cada se forem compradas menos de uma dúzia, e R$
// 1.30 se forem compradas pelo menos 12. Escreva um programa que leia o número
// de maçãs compradas, calcule e escreva o custo total da compra.
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número de maças compradas");
        int nroMacas = in.nextInt();
        float valorUnitario;
        if(nroMacas < 12){
            valorUnitario = 1.5f;
        } else {
            valorUnitario = 1.3f;
        }
        float valorTotal = nroMacas * valorUnitario;
        System.out.printf("O valor total da compra é R$:%.2f", valorTotal);
    }
}
