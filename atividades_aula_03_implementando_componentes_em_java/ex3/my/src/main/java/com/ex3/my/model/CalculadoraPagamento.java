package com.ex3.my.model;

public class CalculadoraPagamento implements IRCalculaPagamento {

    double horasTrabalhadas;
    double valorHora;

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double connect(ICalculaHorasTrabalhadas calculadoraHorasTrabalhadas) {
        return calculadoraHorasTrabalhadas.update() * valorHora;
    }

}
