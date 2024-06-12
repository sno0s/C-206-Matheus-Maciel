package org.example;

import Exceptions.InfoInvalidaException;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int matricula;
    private String curso;
    private float media;

    //Construtores
    public Aluno(String nome, int matricula, String curso, float media) throws InfoInvalidaException {
        if(media < 0)
            throw new InfoInvalidaException("--->ERRO:Média do aluno não pode ser menor que 0\n");
        else
            this.media = media;
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    public Aluno() {
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    //Comparador média
    @Override
    public int compareTo(Aluno o) {
        return Float.compare(o.getMedia(), this.media);
    }
}
