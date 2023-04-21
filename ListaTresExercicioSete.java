package ListaTresExercicios;

import java.util.Scanner;

public class ListaTresExercicioSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i+1) + " número: ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] %2 == 0) {
                pares++;
            }
            else {
                impares++;
            }

            System.out.println("Quantidade de números pares: " + pares);
            System.out.println("Quantidade de números ímpares: " + impares);
            sc.close();
        }
    }
}
