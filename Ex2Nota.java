import java.util.Scanner;

public class Ex2Nota {
    /*
     * Faça um programa que peça uma nota entre 0 e 10.
     * Mostre uma mensagem caso o valor seja inválido
     * e continue solicitando até que o usuário
     * informe um valor válido.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota inválida. Por favor, digite novamente. A nota deve ser um dígito entre 0 e 10.");
            nota = scan.nextInt();
        }
    }
}
