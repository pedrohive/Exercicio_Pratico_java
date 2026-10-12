package org.example;

import org.example.pessoas.Clientes;
import org.example.pessoas.Funcionario;
import org.example.pessoas.Pessoas;
import org.example.produtos.Produtos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoas> pessoas = new ArrayList<>();
        pessoas.add(new Clientes());
        pessoas.add(new Funcionario());

        Pessoas.apresentacao();

    }
}