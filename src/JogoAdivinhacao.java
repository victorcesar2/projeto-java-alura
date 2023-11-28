import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAdivinhador = 0;
        int numeroAserAdivinhado = 0;
        numeroAserAdivinhado = new Random().nextInt(100);
        for (int i = 0; i < 5; i++ ){
            System.out.println("Digite um número de 0 a 100, serão 5 tentativas: ");
            numeroAdivinhador = leitura.nextInt();
            if (numeroAdivinhador != numeroAserAdivinhado){
                if (numeroAdivinhador > numeroAserAdivinhado){
                    System.out.println("O número digitado é maior que o número misterioso, tente novamente ");
                }else {
                    System.out.println("O número digitado é menor que o número misterioso, tente novamente ");
                }
            }else{
                System.out.println("Parabéns Você acertou o número misterioso!");
                break;
            }

        }

    }
}
