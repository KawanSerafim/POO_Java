package edu.curso.aula04.exercicio09.escola;

public class Aluno {
    private String nome;
    private String ra;
    
    public Aluno(){}
    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }
}