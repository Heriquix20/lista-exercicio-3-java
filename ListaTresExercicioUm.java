package ListaTresExercicios;

import java.util.Scanner; 

public class ListaTresExercicioUm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        do { System.out.println("\nInforme uma nota de 1 a 10: ");
        nota = sc.nextDouble();

        if (nota > 10) {
            System.out.println("\nA nota digitada é inválida. Tente novamente.");
        }
        else {
            System.out.println("Nota válida.");
        break;
        }
    } while(true);

    sc.close();
    }
}