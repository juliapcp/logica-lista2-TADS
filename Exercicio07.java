import java.util.Scanner;

// Faça um algoritmo que pergunte quanto a pessoa ganha por hora (salário por hora)
// e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
// referido mês e qual será seu salário atual. Calcule também o salário líquido
// (desconto de impostos) considerando 15% de impostos e mostre esses valores.
// a. Pergunte ao usuário qual a % de imposto que é descontada do salário.
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu salário por hora, o número de horas trabalhadas no mês e o percentual de descontos de impostos");
        float salarioHora = in.nextFloat();
        float horasTrabalhadas = in.nextFloat();
        float percentualImposto = in.nextFloat() / 100;
        float salarioBruto = salarioHora * horasTrabalhadas;
        float desconto = salarioBruto * percentualImposto;
        float salarioLiquido = salarioBruto - desconto;
        System.out.printf("Salário bruto: R$%.2f\n", salarioBruto);
        System.out.printf("Desconto: R$%.2f\n", desconto);
        System.out.printf("Salário líquido: R$%.2f\n", salarioLiquido);

    }
}
