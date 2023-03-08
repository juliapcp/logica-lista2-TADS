import java.util.Scanner;

// Escreva um programa que pergunte o raio de uma circunferência, e sem seguida
// mostre o diâmetro, comprimento e área da circunferência. Considere PI = 3.141692
public class Exercicio09 {
    public static void main(String[] args) {
        final float pi = 3.141692f;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o raio da circunferência:");
        float raio = in.nextFloat();
        float diametro = 2 * raio;
        float comprimento = 2 * pi *raio;
        float area = pi * (raio * raio);
        System.out.printf("Diâmetro: %.2f \nComprimento: %.2f \nÁrea: %.2f", diametro, comprimento, area);
    }
}
