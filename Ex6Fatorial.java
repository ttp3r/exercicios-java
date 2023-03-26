import java.util.Scanner;

import javax.management.QueryEval;

public class Ex6Fatorial {
    /*
     * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo
     * usuário.
     * Ex.: 5! = 120 (ex 5x4x3x2x1)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha o fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");

        for(int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;

        }

        System.out.println(multiplicacao);
    }
}