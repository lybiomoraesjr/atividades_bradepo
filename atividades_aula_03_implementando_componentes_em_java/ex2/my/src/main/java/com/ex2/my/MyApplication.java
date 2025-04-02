package com.ex2.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ex2.my.model.Estoque;
import com.ex2.my.model.Pedido;

@SpringBootApplication
public class MyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
		Estoque estoque = new Estoque();

		Pedido pedido = new Pedido();

		pedido.processaPedido(estoque);
	}

}
