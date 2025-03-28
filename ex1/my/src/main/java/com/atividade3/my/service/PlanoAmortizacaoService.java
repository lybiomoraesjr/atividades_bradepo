package com.atividade3.my.service;

import com.atividade3.my.model.ICalculadoraDeJuros;

public class PlanoAmortizacaoService {

    private final ICalculadoraDeJuros calculadora;

    public PlanoAmortizacaoService(ICalculadoraDeJuros calculadora) {
        this.calculadora = calculadora;
    }

    public void gerar(double principal, double taxaJuros, int tempo) {
        double valorFinal = calculadora.calcular(principal, taxaJuros, tempo);
        double parcela = valorFinal / tempo;

        System.out.println("Plano de Amortização:");
        System.out.println("Valor inicial do empréstimo: " + principal);
        System.out.println("Valor final após " + tempo + " períodos: " + valorFinal);
        System.out.println("Valor da parcela mensal: " + parcela);

        double saldoDevedor = valorFinal;
        for (int i = 1; i <= tempo; i++) {
            saldoDevedor -= parcela;
            System.out.printf("Mês %d: Saldo devedor: %.2f\n", i, saldoDevedor);
        }
    }
}