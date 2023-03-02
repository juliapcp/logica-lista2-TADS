
import java.util.Scanner;

//Ler um valor e escrever se é positivo ou negativo(considere o valor zero como positivo).

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor");
        float valor = in.nextFloat();
        boolean isPositivo = valor >= 0f;
        System.out.println("O valor é "+(isPositivo? "positivo" : "negativo"));
    }
}
