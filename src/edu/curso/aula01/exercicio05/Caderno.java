package exercicio05;
public class Caderno {
    private int qtdFolhas;
    private int qtdMaterias;
    private String corFolhas;
    private String corCapa;
    private String modelo;

    public Caderno(){};

    public Caderno(int qtdFolhas, int qtdMaterias, String corFolhas, String corCapa, String modelo) {
        this.qtdFolhas = qtdFolhas;
        this.qtdMaterias = qtdMaterias;
        this.corFolhas = corFolhas;
        this.corCapa = corCapa;
        this.modelo = modelo;
    }

    public int getQtdFolhas() {
        return qtdFolhas;
    }
    public int getQtdMaterias() {
        return qtdMaterias;
    }
    public String getCorFolhas() {
        return corFolhas;
    }
    public String getCorCapa() {
        return corCapa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setQtdFolhas(int qtdFolhas) {
        this.qtdFolhas = qtdFolhas;
    }
    public void setQtdMaterias(int qtdMaterias) {
        this.qtdMaterias = qtdMaterias;
    }
    public void setCorFolhas(String corFolhas) {
        this.corFolhas = corFolhas;
    }
    public void setCorCapa(String corCapa) {
        this.corCapa = corCapa;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void abrir(){
        System.out.println("Abrindo o caderno");
    }
    public void fechar(){
        System.out.println("Fechando o caderno");
    }
    public void passarFolha(){
        System.out.println("Passando para a proxima folha");
    }
}