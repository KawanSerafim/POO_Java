package edu.curso.aula04.exercicio09.carro;

public class Motor {
    private int cavalos;
    private String modelo;

    public Motor(){}
    public Motor(int cavalos, String modelo) {
        this.cavalos = cavalos;
        this.modelo = modelo;
    }

    public int getCavalos() {
        return this.cavalos;
    }
    public String getModelo() {
        return this.modelo;
    }
}