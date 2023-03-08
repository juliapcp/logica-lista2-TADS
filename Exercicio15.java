import java.util.Scanner;

// Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas
// inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o
// tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um
// dia e terminar no dia seguinte
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a hora de início e a hora de fim de um jogo de Xadrez");
        int horaInicio = in.nextInt();
        int horaFim = in.nextInt();
        int duracaoJogo = horaFim - horaInicio;
        if (duracaoJogo < 0){
            duracaoJogo = 24 - (duracaoJogo * -1) ;
        } 
        System.out.printf("A duração do jogo é de %d horas",duracaoJogo );
    }
}
