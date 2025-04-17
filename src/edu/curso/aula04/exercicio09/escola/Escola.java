package edu.curso.aula04.exercicio09.escola;

public class Escola {
    Aluno aluno;
    SalaAula salaAula;

    public Escola(){}
    public Escola(Aluno aluno, int numero, char bloco) {
        this.aluno = aluno;
        this.salaAula = new SalaAula(numero, bloco);
    }

    public String getAluno() {
        return " E agregada pelo aluno(a) " + aluno.getNome() +
                ", com o RA: " + aluno.getRa();

    }
    public String getSalaAula() {
        return "Ela é composta pela sala de aula de numero " + 
                salaAula.getNumero() + " no bloco " + salaAula.getBloco() +
                ".";
    }
}