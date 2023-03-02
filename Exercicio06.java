import java.util.Scanner;

// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
// e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365
// dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje.
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a idade em anos, meses e dias");
        int anos = in.nextInt();
        int meses = in.nextInt();
        int dias = in.nextInt();
        int diasVividos = (anos * 365) + (meses * 30) + dias;
        System.out.println("O número de dias que você viveu é "+ diasVividos);
    }
}
