package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean running = true;
        Arquivo arq = new Arquivo();
        ArrayList<Cliente> clientes;

        System.out.println("Bem vindo! Escolha uma das opções abaixo: ");

        while(running){
            System.out.println("(1)Cadastrar cliente\n(2)Listar clientes\n(3)Ordenar clientes em ordem alfabética\n(4)Ordenar clientes de Z-A\n(5)Sair\n");
            int escolha = entrada.nextInt();

            switch(escolha){
                case 1:
                    //Entrada de dados para a criaçao de novos clientes
                    System.out.println("Digite o nome: ");
                    entrada.nextLine();
                    String nome = entrada.nextLine();
                    System.out.println("Digite o CPF: ");
                    String cpf = entrada.nextLine();
                    System.out.println("Digite o endereço: ");
                    String end = entrada.nextLine();
                    System.out.println("Digite a idade: ");
                    int idade = entrada.nextInt();
                    arq.escrever(new Cliente(nome, cpf, end, idade));

                    break;
                case 2:
                    clientes = arq.ler();
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println("INFORMACOES DO CLIENTE");
                        System.out.println("Nome: " + clientes.get(i).getNome());
                        System.out.println("CPF: " + clientes.get(i).getCpf());
                        System.out.println("Endereço: " + clientes.get(i).getEndereco());
                        System.out.println("Idade: " + clientes.get(i).getIdade());
                    }
                    break;
                case 3:
                    //saída ordenada
                    clientes = arq.ler();
                    Collections.sort(clientes);
                    System.out.println("Informações ordenadas: ");

                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println("INFORMACOES DO CLIENTE");
                        System.out.println("Nome: " + clientes.get(i).getNome());
                        System.out.println("CPF: " + clientes.get(i).getCpf());
                        System.out.println("Endereço: " + clientes.get(i).getEndereco());
                        System.out.println("Idade: " + clientes.get(i).getIdade());
                    }

                    break;
                case 4:
                    //saída ordenada Z-A
                    clientes = arq.ler();
                    Collections.sort(clientes);
                    Collections.reverse(clientes);
                    System.out.println("Informações ordenadas de Z-A: ");

                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println("INFORMACOES DO CLIENTE");
                        System.out.println("Nome: " + clientes.get(i).getNome());
                        System.out.println("CPF: " + clientes.get(i).getCpf());
                        System.out.println("Endereço: " + clientes.get(i).getEndereco());
                        System.out.println("Idade: " + clientes.get(i).getIdade());
                    }

                    break;
                case 5:
                    running = false;
                    break;

            }

        }

        }
    }

