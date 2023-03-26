public class Ex7OrdemInversa {
    /*
     * Crie um programa de 6 números inteiros e mostre-os na ordem inversa.
     * Arrays/vetores.
     */

    public static void main(String[] args) {

        int[] vetor = { -5, -6, 15, 50, 8, 4 };

        System.out.print("Vetor original: ");
        int count = 0;
        while (count <= (vetor.length - 1)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor na ordem inversa: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
