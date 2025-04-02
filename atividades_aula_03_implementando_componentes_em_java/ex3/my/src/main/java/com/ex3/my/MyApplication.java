package com.ex3.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ex3.my.model.CalculadoraHorasTrabalhadas;
import com.ex3.my.model.ICalculaHorasTrabalhadas;

@SpringBootApplication
public class MyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
		ICalculaHorasTrabalhadas calculadoraHorasTrabalhadas = new CalculadoraHorasTrabalhadas();

	}

}
