import java.util.Scanner;

// Escreva um programa que faça a leitura de dois valores reais e faça a divisão entre
// eles se o denominador não for zero. Ao final deve ser impresso o resultado ou uma
// mensagem de erro.
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite os dois valores reais");
        float numerador = in.nextFloat();
        float denominador = in.nextFloat();
        if(denominador != 0f){
            System.out.printf("A divisão entre eles é %.2f", numerador / denominador);
        } else {
            System.out.println("Entrada do numerador não pode ser zero");
        }
    }
}
