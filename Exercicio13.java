import java.util.Scanner;

// Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
// simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
// (considerar que média igual ou maior que 6.0 o aluno é aprovado). Escrever também
// a média calculada.
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite as duas notas do aluno");
        float primeiraNota = in.nextFloat();
        float segundaNota = in.nextFloat();
        float media = (primeiraNota + segundaNota)/2;
        if(media >= 6f){
            System.out.println("O aluno foi aprovado");
        } else {
            System.out.println("O aluno foi reprovado");
        }
        System.out.printf("A média do aluno foi de %.2f\n", media);
    }
}
