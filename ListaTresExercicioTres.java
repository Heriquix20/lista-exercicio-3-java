package ListaTresExercicios;

import java.util.Scanner;

public class ListaTresExercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double idade, salario;
        char sexo;
        char estadoCivil;

    do {System.out.println("\nInforme seu nome (maior que 3 caracteres):");
        nome = sc.nextLine();
        if (nome.length() <= 3) {
            System.out.println("Nome inválido. Tente novamente");
        }
    }while (nome.length() <= 3);
    
    do {System.out.println("\nInforme sua idade (entre 0 e 150):");
        idade = sc.nextDouble();
        if (idade < 0 || idade > 150) {
            System.out.println("Idade inválida. Tente novamente");
        }
    }while (idade < 0 || idade > 150);
       
    do {System.out.println("\nInforme seu salario (maior que zero): ");
        salario = sc.nextDouble();
        if (salario <= 0) {
            System.out.println("Salário inválido. Tente novamente");
        }
    }while (salario <= 0);

    do {System.out.println("\nInforme seu sexo (f ou m): ");
        sexo = sc.next().charAt(0);
        if (sexo != 'f' && sexo != 'm') {
            System.out.println("Sexo inválido. Tente novamente");
        }
    }while (sexo != 'f' && sexo != 'm')    ;
    
    do {System.out.println("\nInforme seu estado civil: (s, c, v ou d)");
        estadoCivil = sc.next().charAt(0);
        if (estadoCivil != 'c' && estadoCivil != 's' && estadoCivil != 'v' && estadoCivil != 'd') {
            System.out.println("Estado civil inválido. Tente novamente");
        }
    } while(estadoCivil != 'c' && estadoCivil != 's' && estadoCivil != 'v' && estadoCivil != 'd');

    System.out.println("\nNome: " +nome);
    System.out.println("\nIdade: " +idade);
    System.out.println("\nSalário: " +salario);
    System.out.println("\nSexo: " +sexo);
    System.out.println("\nEstado civil: " +estadoCivil);
}
}


