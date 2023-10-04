package parte2;


public class Funcionario {
    private String name;
    private String sobrenome;
    private char genero;
    private String idade;
    
    private double salario;
    private boolean podeSerPromovido;

    public Funcionario(String name, String sobrenome,char genero, String idade, int anosTrabalhados, double salario,
            boolean podeSerPromovido) {

        this.name = name;
        this.sobrenome = sobrenome;
        this.genero = genero;
        this.idade = idade;
        
        this.salario = salario;
        this.podeSerPromovido = podeSerPromovido;
        
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isPodeSerPromovido() {
        return podeSerPromovido;
    }

    public void setPodeSerPromovido(boolean podeSerPromovido) {
        this.podeSerPromovido = podeSerPromovido;
    }

    @Override
    public String toString() {
        return "Funcionario [name=" + name + ", sobrenome=" + sobrenome + ", genero=" + genero + ", idade=" + idade
                + ", salario=" + salario + ", podeSerPromovido=" + podeSerPromovido + "]";
    }    
}
