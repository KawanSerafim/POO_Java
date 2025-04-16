package edu.curso.aula04.exercicio09;

import edu.curso.aula04.exercicio09.carro.Carro;
import edu.curso.aula04.exercicio09.carro.Motorista;

public class Exercicio09 {
    public String carro(String modelo, int cavalos, String cnh, String nomeMotorista) {
        Motorista motorista = new Motorista(cnh, nomeMotorista);
        Carro carro = new Carro(modelo, cavalos, motorista);

        return "\nCarro criado! " + carro.getMotor() + carro.getMotorista();
    }
}