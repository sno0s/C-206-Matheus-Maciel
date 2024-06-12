package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean running = true;
        Arquivo arq = new Arquivo();
        ArrayList<Produto> produtos;


        //Início do programa

        while(running){
            System.out.println("\nBem vindo! Escolha uma opção:\n(1)Adicionar produto;\n(2)Mostrar produtos;\n(3)Ordenar produtos [Em ordem de preço];\n(4)Mostrar quantidade de produtos existentes de cada tipo.");
            System.out.print("Escolha:");
            int escolha = entrada.nextInt();

            switch (escolha){
                case 1:
                    int choice;
                    //Adicionando produto ao arquivo
                    String tipo = "";
                    System.out.print("Digite o nome do produto: ");
                    entrada.nextLine();
                    String nome = entrada.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = entrada.nextDouble();
                    System.out.print("Digite o tipo do produto:\n(1)Comida\n(2)Decoração\n(2)Higiene");
                    //Flag básica pra tratamento de erros
                    do{
                        choice = entrada.nextInt();
                        if(choice!=1 && choice!=2 && choice!=3)
                            System.out.print("Opção incorreta, tente novamente: ");
                    }while(choice!=1 && choice!=2 && choice!=3);
                    switch (choice){
                        case 1:
                            tipo = "Comida";
                            break;
                        case 2:
                            tipo = "Decoração";
                            break;
                        case 3:
                            tipo = "Higiene";
                            break;
                    }
                    //Escrevendo no arquivo
                    arq.escrever(new Produto(nome, preco, tipo));
                    break;
                case 2:
                    //Lendo e mostrando todos os produtos cadastrados no bloco de notas
                    produtos = arq.ler();
                    System.out.println("\n--->Listando todos os produtos:");
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("Produto ("+i+"):");
                        System.out.println("Nome: " + produtos.get(i).getNome());
                        System.out.println("Preço: " + produtos.get(i).getPreco());
                        System.out.println("Tipo: " + produtos.get(i).getTipo());
                    }
                    break;
                case 3:
                    //listando produtos de preço decrescente
                    produtos = arq.ler();
                    Collections.sort(produtos);

                    System.out.println("\n--->Listando todos os produtos:");
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("Produto ("+i+"):");
                        System.out.println("Nome: " + produtos.get(i).getNome());
                        System.out.println("Preço: " + produtos.get(i).getPreco());
                        System.out.println("Tipo: " + produtos.get(i).getTipo());
                    }
                    break;
                case 4:
                    //mostrando um produto de cada tipo
                    int comida=0;
                    int higiene=0;
                    int decoracao=0;
                    produtos = arq.ler();
                    for (int i = 0; i < produtos.size(); i++) {
                        if(produtos.get(i).getTipo().equals("Comida"))
                            comida++;
                        if(produtos.get(i).getTipo().equals("Higiene"))
                            higiene++;
                        if(produtos.get(i).getTipo().equals("Decoração"))
                            decoracao++;
                    }
                    //Saída de dados
                    System.out.println("Comida: " + comida);
                    System.out.println("Higiene: " + higiene);
                    System.out.println("Decoração: " + decoracao);
                    break;
                case 5:
                    running = false;
                    break;
            }
        }


        }
    }

