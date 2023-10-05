package arrays;

public class Arrays2 {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[10];

        System.out.println(clientes[0].nome);
    }
}
class Cliente{
    String nome;
}
