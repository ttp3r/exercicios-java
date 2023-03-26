import java.util.Scanner;

public class Ex5Tabuada {
    /*
     * Desenvolva um gerador de tabuada capaz de gerar
     * a tabuada de qualquer número inteiro.
     * A saída deve ser conforme o exemplo abaixo:
     * 
     * Tabuada do 5:
     * 5 x 1 = 5
     * 5 x 2 = 10
     * ...
     */

     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tabuada você deseja? ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + "x" + i + " = " + (tabuada*i));

        }
     }
}
