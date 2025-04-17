package edu.curso.aula04.exercicio09.computador;

public class Computador {
    private PlacaMae placaMae;
    private Mouse mouse;

    public Computador() {}
    public Computador(String fabricante, String processador, Mouse mouse) {
        this.placaMae = new PlacaMae(fabricante, processador);
        this.mouse = mouse;
    }

    public String getPlacaMae() {
        return "Ele é composto pela placa mae do fabricante " + placaMae.getFabricante() +
                ", com o processador: " + placaMae.getProcessador();
    }
    public String getMouse() {
        return ". E eh agregado pelo mouse de modelo: " + mouse.getModelo() + ", com " +
        mouse.getQtdBotoes() + " botões.";
    }
}