package org.example;

public class Main {
    public static void main(String[] args) {

        Produtos notebook = new Produtos("Notebook", 3500, 10);
        Produtos mouse = new Produtos("Mouse", 120, 50);
        Produtos monitor = new Produtos("Monitor", 900,15);

        notebook.informaçõesProdutos();

    }
}