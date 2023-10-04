package parte2;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        /* String texto = "Bom dia seu jose";
        int inteiro = 541;
        double d = 45.954645454545;
        System.out.printf("Fulano falou: %n%s, %.3f vezes", texto, d);
        System.out.println(String.format("R$ %.2f", d).replace(",","."));
        int i = (int) d;
        System.out.println(i);
        // Entrada de dados
        System.out.println("Me de bomdia!");
        String = fa
        */
        
        
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe seu primeiro nome: ");
        //Solicitar nome para a criação da objeito
        String nome = leitura.next();
        leitura.nextLine(); //next apenas o primeira palavra nextLine = toda a linha
        System.out.println("Informe o seu sobrenome: ");
        String sobrenome = leitura.nextLine();

        System.out.println("Qual o seu genero (M/F): ");
        char genero = leitura.next().charAt(0);
        System.out.println("Digite sua idade: ");
        int idade = leitura.nextInt();
        System.out.println("Digite o seu salario: ");
        double salario = leitura.nextDouble();
        System.out.println("Informe se o funcionario pode ser promovido: ");
        boolean podeSerPromovido = leitura.nextBoolean();

        Funcionario funcionario = new Funcionario(nome, sobrenome, genero, sobrenome, idade, salario, podeSerPromovido);
        leitura.close();
        System.out.println(funcionario);
        

    
    }
}
