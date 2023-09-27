package entidades;

public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String uf;
    private String cidade;
    private String bairro;
    private String cep;

    public Endereco(String logradouro, String complemento, String cidade, String cep, String uf, String bairro, int numero){
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    @Override
    public String toString() {
        return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento + ", uf="
                + uf + ", cidade=" + cidade + ", bairro=" + bairro + ", cep=" + cep + "]";
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String enderecoCompleto(){
        return logradouro + ", " + numero + ", " + complemento + ", " + bairro + ", " + cidade + "/" + uf + ", " + cep;
    }

}
