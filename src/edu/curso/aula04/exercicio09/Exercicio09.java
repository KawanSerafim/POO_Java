package edu.curso.aula04.exercicio09;

import edu.curso.aula04.exercicio09.carro.Carro;
import edu.curso.aula04.exercicio09.carro.Motorista;
import edu.curso.aula04.exercicio09.computador.Computador;
import edu.curso.aula04.exercicio09.computador.Mouse;
import edu.curso.aula04.exercicio09.escola.Aluno;
import edu.curso.aula04.exercicio09.escola.Escola;

public class Exercicio09 {
    public String carro(String modelo, int cavalos, String cnh, String nomeMotorista) {
        Motorista motorista = new Motorista(cnh, nomeMotorista);
        Carro carro = new Carro(modelo, cavalos, motorista);

        return "\nCarro criado! " + carro.getMotor() + carro.getMotorista();
    }

    public String escola(int numero, char bloco, String nomeAluno, String ra) {
        Aluno aluno = new Aluno(nomeAluno, ra);
        Escola escola = new Escola(aluno, numero, bloco);

        return "\nEscola criada! " + escola.getSalaAula() + escola.getAluno();
    }

    public String computador(String fabricante, String processador, String modelo, int qtdBotoes) {
        Mouse mouse = new Mouse(modelo, qtdBotoes);
        Computador computador = new Computador(fabricante, processador, mouse);
        return "\nComputador! " + computador.getPlacaMae() + computador.getMouse();
    }
}