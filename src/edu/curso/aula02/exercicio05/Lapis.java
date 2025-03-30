package exercicio05;
public class Lapis{
    private float ponta;
    private float tamanho;
    private String cor;
    private String modelo;
    private String material;

    public Lapis(){};

    public Lapis(float ponta, float tamanho, String cor, String modelo, String material) {
        this.ponta = ponta;
        this.tamanho = tamanho;
        this.cor = cor;
        this.modelo = modelo;
        this.material = material;
    }

    public float getPonta() {
        return ponta;
    }
    public float getTamanho() {
        return tamanho;
    }
    public String getCor() {
        return cor;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMaterial() {
        return material;
    }
    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public void escrever() {
        if(ponta > 0 && tamanho > 0)
            System.out.println("Escrevendo");
    }
    public void tracarLinha() {
        if(ponta > 0 && tamanho > 0)
            System.out.println("Traçando uma linha");
    }
    public void desenharQuadrado() {
        if(ponta > 0 && tamanho > 0)
            System.out.println("Desenhando um quadrado");
    }
}