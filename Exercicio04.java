import java.util.Scanner;

public class Exercicio04 {
//     Escreva um programa que faça a leitura de dois valores inteiros e descubra qual
// deles é o maior, imprimindo na resposta o nome da variável e o seu valor.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite os dois valores inteiros");
        int valor1 = in.nextInt();
        int valor2 = in.nextInt();
        System.out.println("O maior valor é o "+(valor1 > valor2 ? "valor1: "+valor1 : "valor 2: " + valor2 ));
    }
}
