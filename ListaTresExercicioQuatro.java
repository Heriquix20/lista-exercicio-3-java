package ListaTresExercicios;

import java.util.Scanner;

public class ListaTresExercicioQuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1, numero2, numero3, numero4, numero5, mediaAritmetica, soma;

        System.out.println("\nInforme o primeiro número: ");
        numero1 = sc.nextDouble();
        System.out.println("\nInforme o segundo número: ");
        numero2 = sc.nextDouble();
        System.out.println("\nInforme o terceiro número: ");
        numero3 = sc.nextDouble();
        System.out.println("\nInforme o quarto número: ");
        numero4 = sc.nextDouble();
        System.out.println("\nInforme o quinto número: ");
        numero5 = sc.nextDouble();

        mediaAritmetica = (numero1 + numero2 + numero3 + numero4 + numero5) /5;
        soma = numero1 + numero2 + numero3 + numero4 + numero5;

        System.out.println("\nA média atitmetica desses números é: " + mediaAritmetica);
        System.out.println("\nA soma desses números é: "+soma);

        sc.close();
    }
}
