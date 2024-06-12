package org.example;

import Exceptions.InfoInvalidaException;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws InfoInvalidaException {

        Scanner entrada = new Scanner(System.in);
        boolean running = true;
        Arquivo arq = new Arquivo();
        ArrayList<Aluno> alunos;

        //Início do programa
        System.out.println("\nBem vindo! Escolha uma opção:");

        while(running){
            System.out.println("(1)Adicionar aluno;\n(2)Mostrar alunos;\n(3)Ordenar alunos (Média menor para maior);\n(4)Mostrar quantidade de alunos existentes de cada curso.");
            System.out.print("Escolha:");
            int escolha = entrada.nextInt();

            switch (escolha){
                case 1:
                    int choice;
                    //Coletando informações do aluno
                    String curso = "";
                    System.out.print("Digite o nome do aluno: ");
                    entrada.nextLine();
                    String nome = entrada.nextLine();
                    System.out.print("Digite a matrícula do aluno: ");
                    int matricula = entrada.nextInt();
                    System.out.print("Digite a média do aluno: ");
                    float media = entrada.nextFloat();
                    //Decidindo o curso
                    System.out.print("Escolha o curso do aluno:\n(1)Computação\n(2)Software\n(3)Telecomunicações");
                    //Flag básica pra tratamento de erros
                    do{
                        System.out.println("Escolha:");
                        choice = entrada.nextInt();
                        if(choice!=1 && choice!=2 && choice!=3)
                            System.out.print("Opção incorreta, tente novamente: ");
                    }while(choice!=1 && choice!=2 && choice!=3);
                    switch (choice){
                        case 1:
                            curso = "Computação";
                            break;
                        case 2:
                            curso = "Software";
                            break;
                        case 3:
                            curso = "Telecomunicações";
                            break;
                    }
                    //tentando escrever no arquivo e tratando erro de média menor que 0
                    try{
                        arq.escrever(new Aluno(nome, matricula, curso, media));
                    }catch (InfoInvalidaException e){
                        System.out.println(e.getMessage());
                        break;
                    }

                    break;
                case 2:
                    //Lendo e mostrando todos os alunos cadastrados no bloco de notas
                    alunos = arq.ler();
                    System.out.println("\n--->Listando todos os alunos:");
                    for (int i = 0; i < alunos.size(); i++) {
                        System.out.println("--->Aluno ("+i+"):");
                        System.out.println("Nome: " + alunos.get(i).getNome());
                        System.out.println("Matrícula: " + alunos.get(i).getMatricula());
                        System.out.println("Curso: " + alunos.get(i).getCurso());
                        System.out.println("Média: " + alunos.get(i).getMedia());
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    //listando alunos por ordem crescente de média
                    alunos = arq.ler();
                    Collections.sort(alunos);
                    Collections.reverse(alunos);

                    System.out.println("\n--->Listando todos os alunos:");
                    for (int i = 0; i < alunos.size(); i++) {
                        System.out.println("--->Aluno ("+i+"):");
                        System.out.println("Nome: " + alunos.get(i).getNome());
                        System.out.println("Matrícula: " + alunos.get(i).getMatricula());
                        System.out.println("Curso: " + alunos.get(i).getCurso());
                        System.out.println("Média: " + alunos.get(i).getMedia());
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    //mostrando um produto de cada tipo
                    int comp=0;
                    int soft=0;
                    int teleco=0;
                    alunos = arq.ler();
                    for (int i = 0; i < alunos.size(); i++) {
                        if(alunos.get(i).getCurso().equals("Computação"))
                            comp++;
                        if(alunos.get(i).getCurso().equals("Software"))
                            soft++;
                        if(alunos.get(i).getCurso().equals("Telecomunicações"))
                            teleco++;
                    }
                    //Saída de dados
                    System.out.println("\nComputação: " + comp);
                    System.out.println("Software: " + soft);
                    System.out.println("Telecomunicações: " + teleco);
                    System.out.println("\n");
                    break;
                case 5:
                    running = false;
                    break;
            }
        }

    }
}