package com.example.appvenda.model;

public class AppModel {

    private double valorUnidade;
    private double quantidade;
    private double desconto;

    public AppModel(double valorUnidade, double quantidade, double desconto) {
        this.valorUnidade = valorUnidade;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public double getValorUnidade() {
        return valorUnidade;
    }

    public void setValorUnidade(double valorUnidade) {
        this.valorUnidade = valorUnidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
