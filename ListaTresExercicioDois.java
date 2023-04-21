package ListaTresExercicios;

import java.util.Scanner;

public class ListaTresExercicioDois {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario;
        String senha;

        do { System.out.println("\nInforme seu o nome de usuário: ");
             usuario = sc.nextLine();
             System.out.println("\nInforme sua senha: ");
             senha = sc.nextLine();

        if (usuario.equals(senha)) {
            System.out.println("\nErro! Tente novamente");
        }
        else {
            System.out.println("\nSeja bem vindo " + usuario);
            break;
        }
    } while (true);
    sc.close();
    }
}
