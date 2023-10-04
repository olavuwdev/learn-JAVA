package application;

import java.util.Scanner;

public class Exempl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos termos da sequência Fibonacci você deseja gerar? ");
        int n = input.nextInt();
        input.close();

        int primeiroTermo = 0, segundoTermo = 1;

        System.out.print("Sequência Fibonacci com " + n + " termo(s): ");

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiroTermo + " ");
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
            
            }
    }
}