package edu.curso.aula02.exercicio07;

public class Caixa {
    private double saldo;
    
    public String venda() {
        return "" + this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }
}