import java.util.Scanner;
// Faça um programa que receba dois números e efetua a adição. Caso o valor
// somado seja maior que 20, este deverá ser apresentado somando-se a ele 8; caso
// o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se
// 10.
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite dois números");
        float primeiroNro = in.nextFloat();
        float segundoNro = in.nextFloat();
        float soma = primeiroNro + segundoNro;
        float resultado;
        if(soma > 20){
            resultado = soma + 8f;
        } else {
            resultado = soma - 10f;
        }
        System.out.println("O resultado é " + resultado);

    }
}
