package edu.curso.aula04.exercicio09.carro;

public class Carro { 
    private Motor motor;
    private Motorista motorista;

    public Carro(){}
    public Carro(String modelo, int cavalos, Motorista motorista) {
        this.motor = new Motor(cavalos, modelo);
        this.motorista = motorista;
    }

    public String getMotor() {
        return "O seu motor é do modelo " + motor.getModelo() + ", com " 
                + motor.getCavalos() + "cv. ";
    }
    public String getMotorista() {
        return "O motorista do carro é o(a) " + motorista.getNome() +
                ", com a CNH: " + motorista.getCnh() + ".";
    }
}