package com.ex2.my.model;

public class Pedido {

    public void processaPedido(IEstoque estoque) {
        estoque.validaEstoque();
        System.out.println("Estoque disponível");
    }
}
