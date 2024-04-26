import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        //Produto[] produtos =  new Produto[10];
        boolean flag = true;
        Empresa e1 = new Empresa("BEMOL");



        while(flag){
            System.out.printf("---------------------------------------------");
            System.out.println("Bem vindo ao menu de informações da empresa");
            System.out.println("1 - Adicionar um produto a empresa");
            System.out.println("2 - Mostrar as informações da empresa e do produto");
            System.out.println("3 - Sair");

            int escolha = cin.nextInt();
            switch(escolha) {
                case 1:
                    cin.nextLine();
                    System.out.printf("Entre com o nome do produto: ");
                    String nomeprod = cin.nextLine();
                    System.out.printf("Entre com a nota do produto: ");
                    int notaprod = cin.nextInt();
                    System.out.printf("Entre com a quantidade do produto: ");
                    int quantidadeprod = cin.nextInt();
                    cin.nextLine();
                    System.out.printf("Entre com o fabricante do produto: ");
                    String nomefab = cin.nextLine();
                    System.out.printf("Entre com o CNPJ do fabricante: ");
                    int cnpjfab = cin.nextInt();

                    Produto produto1 = new Produto(nomeprod, notaprod, nomefab, cnpjfab, quantidadeprod);
                    e1.adicionaprod(produto1);

                    break;
                case 2:
                    e1.mostrainfo();
                    break;
                case 3:
                    flag = false;
                    break;
            }


        }

    }
}