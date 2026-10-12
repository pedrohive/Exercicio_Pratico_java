package org.example.pessoas;

public class Pessoas {

    private String nome;
    private int idCadastro;
    private int cpf;
    private int dataCadastro;

    public String getNome() {
        return nome;
    }

    public int getIdCadastro() {
        return idCadastro;
    }

    public int getCpf() {
        return cpf;
    }

    public int getDataCadastro() {
        return dataCadastro;
    }

    public static void apresentacao(){
        System.out.println("Olá, eu sou uma pessoa.");
        }
    }

 