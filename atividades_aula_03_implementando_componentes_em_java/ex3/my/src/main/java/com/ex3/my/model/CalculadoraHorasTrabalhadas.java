package com.ex3.my.model;

public class CalculadoraHorasTrabalhadas implements ICalculaHorasTrabalhadas {

    double horasDia;
    int diasTrabalhados;

    public double getHorasDia() {
        return horasDia;
    }

    public void setHorasDia(double horasDia) {
        this.horasDia = horasDia;
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    private double calculaHorasTrabalhadas(double horasDia, int diasTrabalhados) {
        return this.horasDia * this.diasTrabalhados;
    }

    @Override
    public double update() {
        return calculaHorasTrabalhadas(diasTrabalhados, diasTrabalhados);
    }
}