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
        return "Ele é composto pelo seu motor do modelo " 
                + motor.getModelo() + ", com " 
                + motor.getCavalos() + "cv. ";
    }
    public String getMotorista() {
        return "E agregado pelo(a) motorista do carro " 
                + motorista.getNome() +
                ", com a CNH: " + motorista.getCnh() + ".";
    }
}