package org.example;

public class Produtos {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    String nome;
    double preco;
    int estoque;



    //Metodo Construtor.
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