package org.example;

public class Produtos {

    String nome;
    double preco;
    int estoque;



    //Método Construtor.
    Produtos(String nome, double preco, int estoque){

    this.nome = nome;
    this.preco = preco;
    this.estoque = estoque;
    }

    void informaçõesProdutos(){
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(estoque);
    }
}