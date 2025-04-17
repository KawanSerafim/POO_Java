package edu.curso.aula04.exercicio09.computador;

public class PlacaMae {
    private String fabricante;
    private String processador;

    public PlacaMae() {}
    public PlacaMae(String fabricante, String processador) {
        this.fabricante = fabricante;
        this.processador = processador;
    }

    public String getFabricante() {
        return fabricante;
    }
    public String getProcessador() {
        return processador;
    }
}