package edu.curso.aula04.exercicio09.carro;

public class Motorista {
    private String cnh;
    private String nome;

    public Motorista(){}
    public Motorista(String cnh, String nome) {
        this.cnh = cnh;
        this.nome = nome;
    }
    
    public String getCnh() {
        return this.cnh;
    }
    public String getNome() {
        return this.nome;
    }
}