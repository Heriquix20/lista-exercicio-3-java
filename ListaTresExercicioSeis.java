package ListaTresExercicios;

import java.util.Scanner;

public class ListaTresExercicioSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2, numero;

        System.out.println("\nInforme o primeiro número: ");
        numero1 = sc.nextInt();
        System.out.println("\nInforme o segundo número: ");
        numero2 = sc.nextInt();

        numero = numero1+1;

        while(numero < numero2){
        numero++;
        System.out.println("\nNúmero: "+(numero-1));
        }
        sc.close();
    }
}
