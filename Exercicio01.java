
import java.util.Scanner;

// Faça um algoritmo que converta metros para centímetros. Lembrando que 1m =
// 100cm

public class Exercicio01 {
    public static void main(String[] args) {
        float metros, centimetros;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor em metros");
        metros = in.nextFloat();
        if(metros >= 0f){
            centimetros = metros*100;
            System.out.printf("O valor em centímetros é %.2f\n",centimetros);
        } else {
            System.out.println("Entrada inválida");
        }
    }
}