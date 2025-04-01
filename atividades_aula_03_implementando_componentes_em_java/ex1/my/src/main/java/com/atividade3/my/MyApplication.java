package com.atividade3.my;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.atividade3.my.model.CalculadoraDeJurosComposta;
import com.atividade3.my.model.ICalculadoraDeJuros;
import com.atividade3.my.service.PlanoAmortizacaoService;

@SpringBootApplication
public class MyApplication {

	public static void main(String[] args) {
		ICalculadoraDeJuros calculadora = new CalculadoraDeJurosComposta();
		PlanoAmortizacaoService planoService = new PlanoAmortizacaoService(calculadora);

		planoService.gerar(1000.0, 0.05, 12);
	}
}