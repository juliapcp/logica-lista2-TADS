import java.util.Scanner;

public class Exercicio10 {

    // Faça um programa que receba a idade de um nadador e classifique-o numa das
    // seguintes categorias:
    // • Adulto (idade >= 18);
    // • Juvenil (idade >= 14 e idade < 18);
    // • Infantil (idade >=9 e idade < 14);
    // • Mirim (Idade < 9).
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a idade do nadador");
        int idade = in.nextInt();
        String resultado = "";
        if(idade >= 18){
            resultado = "adulto";
        } else if(idade >= 14 ){
            resultado = "juvenil";
        } else if (idade >= 9) {
            resultado = "infantil";
        } else {
            resultado = "mirim";
        }
        System.out.printf("A categoria do nadador é: %s", resultado);
    }
}
