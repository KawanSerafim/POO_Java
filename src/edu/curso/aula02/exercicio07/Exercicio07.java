package edu.curso.aula02.exercicio07;

public class Exercicio07 {
    public String resolucao(double valorProduto) {
        Caixa caixa = new Caixa();
        caixa.setSaldo(valorProduto);
        return caixa.venda();
    }
}