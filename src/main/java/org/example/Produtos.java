package org.example;

public class Produtos {

    private String nome;
    private double preco;
    private int estoque;

    //Metodo Construtor.
    Produtos(String nome, double preco, int estoque){

        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

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

    void informaçõesProdutos(){
        System.out.println(getNome());
        System.out.println(getPreco());
        System.out.println(getEstoque());
    }
}