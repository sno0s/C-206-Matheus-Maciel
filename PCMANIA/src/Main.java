import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean flag = true;
        int escolha;
        Computador computadores[] = new Computador[3];
        Cliente cliente = new Cliente();

        //Criando a promoção 1
        SistemaOperacional linuxUbuntu = new SistemaOperacional("Linux Ubuntu", 32);
        HardwareBasico H1 = new HardwareBasico("Pentium Core i3 (2200 Mhz)\n8 Gb de Memória RAM", 500f);
        MemoriaUSB M1 = new MemoriaUSB("Pen-drive", 16);
        Computador computador1 = new Computador("Positivo", 3300, linuxUbuntu, H1);
        //Adicionando a memória Na promoção 1
        computador1.addMemoriaUSB(M1);
        computadores[0] = computador1;

        //Criando a promoção 2
        SistemaOperacional windows8 = new SistemaOperacional("Windows 8", 64);
        HardwareBasico H2 = new HardwareBasico("Pentium Core i5 (3370 Mhz)\n16 Gb de Memória RAM", 1000f);
        MemoriaUSB M2 = new MemoriaUSB("Pen-drive", 32);
        Computador computador2 = new Computador("Acer", 8800, windows8, H2);
        //Adicionando a memória Na promoção 2
        computador2.addMemoriaUSB(M2);
        computadores[1] = computador2;

        //Criando a promoção 3
        SistemaOperacional windows10 = new SistemaOperacional("Windows 10", 64);
        HardwareBasico H3 = new HardwareBasico("Pentium Core i7 (4500 Mhz)\n32 Gb de Memória RAM", 2000f);
        MemoriaUSB M3 = new MemoriaUSB("HD externo", 1000);
        Computador computador3 = new Computador("Vaio", 4800, windows10, H3);
        //Adicionando a memória Na promoção 3
        computador3.addMemoriaUSB(M3);
        computadores[2] = computador3;


        while(flag){
            System.out.println("(1)Visualizar promoções\n(2)Cadastrar cliente\n(3)Sair");
            do {
                escolha = entrada.nextInt();
                if(escolha != 1 && escolha != 2 && escolha != 3)
                    System.out.println("Escolha errada.\n(1)Visualizar promoções\n(2)Cadastrar cliente\n(3)Sair");
            }while(escolha != 1 && escolha != 2 && escolha != 3);

            switch (escolha){
                case 1:
                    int escolha1;
                    System.out.println("-------> Promoção 1");
                    computador1.mostraPCConfigs();
                    System.out.println("-------> Promoção 2");
                    computador2.mostraPCConfigs();
                    System.out.println("-------> Promoção 3");
                    computador3.mostraPCConfigs();

                    System.out.println("Você deseja comprar algum?\n(1)Promoção 1   (2)Promoção 2    (3)Promoção 3");
                    do {
                        escolha1 = entrada.nextInt();
                        if(escolha1 != 1 && escolha1 != 2 && escolha1 != 3){
                            System.out.println("Escolha Incorreta.\nVocê deseja comprar algum?\n(1)Promoção 1   (2)Promoção 2    (2)Promoção 3");
                        }
                    }while(escolha1 != 1 && escolha1 != 2 && escolha1 != 3);

                    if(cliente.nome == null){
                        System.out.println("\n----------Crie um cadastro primeiro!\n");
                    }
                    else{

                    }
                    break;
                case 2:
                    String nome;
                    long cpf;

                    System.out.println("Digite o nome do cliente: ");
                    nome = entrada.nextLine();
                    entrada.nextLine();
                    System.out.println("Digite o CPF do cliente: ");
                    cpf = entrada.nextLong();

                    cliente.nome = nome;
                    cliente.cpf = cpf;

                    System.out.println("Cliente cadastrado!");
                    break;
                case 3:
                    flag = false;
                    System.out.println("-----Aplicação finalizada.");
                    break;
            }

        }

    }
}
