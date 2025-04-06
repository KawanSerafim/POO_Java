package edu.curso.aula02.exercicio05;

public class Borracha {
    private float tamanho;
    private String formato;
    private String cor;
    private String modelo;
    private boolean comCapinha;

    public Borracha(){};

    public Borracha(float tamanho, String formato, String cor, String modelo, boolean comCapinha){
        this.tamanho = tamanho;
        this.formato = formato;
        this.cor = cor;
        this.modelo = modelo;
        this.comCapinha = comCapinha;
    }

    public float getTamanho() {
        return tamanho;
    }
    public String getFormato() {
        return formato;
    }
    public String getCor() {
        return cor;
    }
    public String getModelo() {
        return modelo;
    }
    public boolean getComCapinha() {
        return comCapinha;
    }
    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setComCapinha(boolean comCapinha) {
        this.comCapinha = comCapinha;
    }

    public void quebrarAoMeio() {
        if(tamanho > 1) {
            System.out.println("Quebrando ao meio");
        }
    }
    public void apagarLapisEscrever() {
        if(tamanho > 0) {
            System.out.println("Apagando lapis de escrever");
        }
    }
    public void apagarLapisCor() {
        if(tamanho > 0) {
            System.out.println("Apagando lapis de cor");
        }
    }

    /*
     * Em minha defesa aos dois ultimos, se usa uma determinada força para cada 
     * tipo de lapis. Geralmente, com o lapis de cor exige mais força e esforço 
     * kkkkkk
     */
}