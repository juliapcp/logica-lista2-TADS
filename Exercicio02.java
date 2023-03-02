import java.util.Scanner;

public class Exercicio02 {

//     Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
// calcular e escrever a área e o perímetro do retângulo.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a base e a altura do retângulo");
        float base = in.nextFloat();
        float altura = in.nextFloat();
        if(base >= 0f && altura >=0f){
            float area = base * altura;
            System.out.printf("A área do retângulo é %.2f\n", area);
            float perimetro  = base * 2 + altura * 2;
            System.out.printf("O perímetro do retângulo é %.2f\n", perimetro);
        } else {
            System.out.println("Entrada inválida");
        }
    }
}
