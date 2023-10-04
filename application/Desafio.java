package application;

import java.util.Scanner;

public class Desafio {
    private String nome ;
    private String tipoDeConta;
    private double saldo;
   

    public Desafio(String nome, String tipoDeConta, double saldo){
        this.nome = nome;
        this.tipoDeConta = tipoDeConta;
        this.saldo = saldo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipoDeConta() {
        return tipoDeConta;
    }
    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Desafio dados = new Desafio("Fernanda Morreira","Correbte",1050);
        
         Scanner leitura = new Scanner(System.in);
         int opcao = 0 ;
         String texto = String.format("""
             ******* DADOS INICIAIS *********
             NOME: %s
             TIPO DE CONTA: %s
             SALDO EM CONTA: %.2f """, dados.getNome(), dados.getTipoDeConta(), dados.getSaldo());
         System.out.println(texto);
         boolean loop = true;
         while(loop){
            String texto1 = """
            =-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            ESCOLHA UMA OPÇÃO ABAIXO.
            DIGITE 1 PARA INFORMAÇOES DA SUA CONTA
            DIGITE 2 PARA ADICIONAR SALDO NA SUA CONTA
            DIGITE 3 PARA REALIZAR UM SAQUE
            DIGITE 4 PARA SAIR    
            *************************""";
            
            System.out.println(texto1);
            opcao = leitura.nextInt();
            if(opcao == 1){
                System.out.println("O saldo atual de "+ dados.getNome() + " é de " + dados.getSaldo());
            }
            else if(opcao == 2){
                System.out.println("Informe o valor a receber: ");
                double valor = leitura.nextDouble();
                dados.setSaldo(dados.getSaldo() + valor);
                System.out.println("Salto atualizado com sucesso! \n Você possui: R$"+ dados.getSaldo() + " Reais");
            }
            else if(opcao == 3){
                System.out.println("Informe o valor que deseja sacar: ");
                double valor = leitura.nextDouble();
                if (dados.getSaldo() < valor){

                    System.out.println("Não a saldo suficiente pra realizar o saque.");
                }
                else{
                    dados.setSaldo(dados.getSaldo() - valor);
                    System.out.println("Salto atualizado com sucesso! \n Você possui: R$"+ dados.getSaldo() + " Reais");             
                }
            }
            else if(opcao == 4){
                System.out.println("Até a proxima!");
                break;
            }
            else{
                System.out.println("Opçao invalida, tente umas das 4 acima.");
            }
        }
    }
}
