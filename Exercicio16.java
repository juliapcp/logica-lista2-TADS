import java.util.Scanner;
// Uma empresa abriu uma linha de crédito para os funcionários. O valor da prestação
// não pode ultrapassar 30% do salário. Faça um programa que receba o salário, o
// valor do empréstimo e o número de prestações e informe se o empréstimo pode ser
// concedido. Nenhum dos valores informados pode ser zero ou negativo.
public class Exercicio16 {
    public static void main(String[] args) {
        final float PERCENT_MAXIMO = 30f;
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Digite o salário, o valor do empréstimo e o número de prestações");
        
        float salario = in.nextFloat();
        float valorEmprestimo = in.nextFloat();
        float nroPrestacoes = in.nextFloat();
        float valorPorPrestacao = valorEmprestimo/nroPrestacoes;
        float percentSalario = salario * (PERCENT_MAXIMO/100);

        if(salario > 0f && valorEmprestimo > 0f && nroPrestacoes > 0f){
            if(valorPorPrestacao > percentSalario){
                System.out.println("O empréstimo não pode ser concedido");
            } else {
                System.out.println("O empréstimo pode ser concedido");
            }
        } else {
            System.out.println("Entrada inválida");
        }
    }
}
