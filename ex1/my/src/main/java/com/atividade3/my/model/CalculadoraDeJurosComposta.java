package com.atividade3.my.model;

public class CalculadoraDeJurosComposta implements ICalculadoraDeJuros {
    @Override
    public double calcular(double principal, double taxaJuros, int tempo) {
        return principal * Math.pow(1 + taxaJuros, tempo);
    }
}