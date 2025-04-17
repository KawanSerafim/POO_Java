package edu.curso.aula04.exercicio09.computador;

public class Mouse {
    private String modelo;
    private int qtdBotoes;

    public Mouse(){}
    public Mouse(String modelo, int qtdBotoes) {
        this.modelo = modelo;
        this.qtdBotoes = qtdBotoes;
    }
    
    public String getModelo() {
        return modelo;
    }
    public int getQtdBotoes() {
        return qtdBotoes;
    }
}