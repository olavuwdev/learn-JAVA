package application;

import entidades.Pessoa;
import entidades.Carro;
import entidades.Endereco;
import entidades.Imovel;

public class Program {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Vitoria", "Silva", 15);
        Carro carro = new Carro("Fiat", "Uno", 2010, 2100.5);
        Endereco endereco = new Endereco("Rua Feiao", "apt 24", "Barauna", "51242-001", "RN", "Povoado", 41);
        Imovel imovel = new Imovel("Apartamento", endereco, 12444.454);
        
        System.out.println(pessoa1.nomeCompleto() + " conquistou aos "+ pessoa1.getIdade() + " anos de idade um imovel e um carro.");
        System.out.println("O carro é um "+ carro.getMarca()+ " " + carro.getModelo()+ " e custou "+ carro.getPreco());
        System.out.println("Já o seu imovel, trata-se de um (a) "+ imovel.getTipoImovel()+ ", que custou "+ imovel.getPrecoImovel());
        System.out.println("O imovel de(a) "+ pessoa1.nomeCompleto() + " está localizado no endereço: " + imovel.getEndereco().enderecoCompleto());
        
    }
}
