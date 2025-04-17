package edu.curso.aula04.exercicio09.escola;

public class SalaAula {
    private int numero;
    private char bloco;

    public SalaAula(){}
    public SalaAula(int numero, char bloco) {
        this.numero = numero;
        this.bloco = bloco;
    }

    public int getNumero() {
        return numero;
    }
    public char getBloco() {
        return bloco;
    }
}