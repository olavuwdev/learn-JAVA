package arrays;

public class Arrays {
    public static void main(String[] args) {
        
        //Declarando array de diversas formas
        
        /* 
        double pesos [];
        long []numeros;
        long[]tamanhos; 
        */
        int[] idades = {0,5,10,15};
        String[] nomes = {"nome1","nome2"};
        String[] cliente = new String[]{new Cliente(), null, new Cliente()};

        System.out.println(cliente.length);

        //for e foreach percorrendo um array

        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }
        for(int idade : idades){
            System.out.println(idade);
        }
    }
}
