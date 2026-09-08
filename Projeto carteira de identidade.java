/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Diga seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Diga sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Diga seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("\n===== RELATÓRIO =====");
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu CPF é: " + cpf);

        scanner.close();
    }
}