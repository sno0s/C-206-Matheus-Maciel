package org.example;

import javax.sound.sampled.Line;

public class Cliente implements Comparable<Cliente> {
    //Atributos do cliente
    private String nome;
    private String cpf;
    private String endereco;
    private int idade;

    //Construtores
    public Cliente(String nome, String cpf, String endereco, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.idade = idade;
    }

    public Cliente() {
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int compareTo(Cliente o) {
        return nome.compareTo(o.getNome());
    }
}
