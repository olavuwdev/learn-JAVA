package entidades;




public class Imovel {
    private String tipoImovel;
    private double precoImovel;
    private Endereco endereco;

    
    public Imovel(String tipoImovel, Endereco endereco, double precoImovel ){
        this.tipoImovel = tipoImovel;
        this.precoImovel = precoImovel;
        this.endereco = endereco;
    }


    public String getTipoImovel() {
        return tipoImovel;
    }


    public void setTipoImovel(String tipoImovel) {
        this.tipoImovel = tipoImovel;
    }


    public double getPrecoImovel() {
        return precoImovel;
    }


    public void setPrecoImovel(double precoImovel) {
        this.precoImovel = precoImovel;
    }
    public Endereco getEndereco(){
        return endereco;
    }

}
