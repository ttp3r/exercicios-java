import java.util.Random;

public class Ex9NumerosAleatorios {
    /*
     * Faça um programa que leia 20 números aleatórios
     * entre 0 e 100 e aemazene-os em um vetor.
     * Ao final, mostre os números e seus sucessores.
     */

     public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
            
        }

        System.out.println("\nSucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
            
        }

     }
}
