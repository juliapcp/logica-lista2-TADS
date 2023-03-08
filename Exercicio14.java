import java.util.Scanner;
// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
// que diga se ela poderá ou não votar este ano (não é necessário considerar o mês
// em que a pessoa nasceu).
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o ano atual e o seu ano de nascimento");
        int anoAtual = in.nextInt();
        int anoNascimento = in.nextInt();
        int diferenca = anoAtual - anoNascimento;
        if(diferenca >= 16){
            System.out.println("Você poderá votar esse ano");
        } else {
            System.out.println("Você não pode votar esse ano");
        }        
    }
}
