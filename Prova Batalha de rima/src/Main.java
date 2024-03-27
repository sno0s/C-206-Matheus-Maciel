import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Arena arena = new Arena();

        arena.nome = "Batalha da norte";
        arena.lugar = "Praça margarida";

        while(flag){
            Scanner entrada = new Scanner(System.in);
            int escolha = 0;

            //Flag de escolha da opção inicial
            System.out.println("(1)Adicionar rappers à arena. \n(2)Mostrar informações da arena e seus rappers. \n(3)Mostrar quais rappers tem microfone dourado. \n(4)Mostrar qual rapper ganhou a batalha e qual ficou em último lugar.\n(5)Sair");
            do{
                escolha = entrada.nextInt();
                if(escolha != 1 && escolha !=2 && escolha !=3 && escolha !=4 && escolha!=5)
                    System.out.println("---Escolha incorrenta, tente novamente!");

            }while(escolha != 1 && escolha !=2 && escolha !=3 && escolha!=4 && escolha!=5);

            switch(escolha){
                case 1:
                    String nomerapper;
                    float notarapper;
                    int idaderapper;

                    //Entrada de dados da ficha do rapper
                    System.out.println("---Digite as informações do rapper para que ele possa ser adicionado à arena.");
                    System.out.println("Nome do rapper: ");
                    entrada.nextLine();
                    nomerapper = entrada.nextLine();
                    System.out.println("Nota do rapper: ");
                    notarapper = entrada.nextFloat();
                    System.out.println("Idade do rapper: ");
                    idaderapper = entrada.nextInt();

                    Microfone microfone = new Microfone();

                    Rapper rapper = new Rapper(nomerapper, notarapper, idaderapper, microfone);
                    arena.addRapper(rapper);
                    break;
                case 2:
                    arena.mostraInfo();
                    break;
                case 3:
                    arena.microfoneDou();
                    break;
                case 4:
                    arena.ranking();
                    break;
                case 5:
                    flag = false;
                    break;

            }
        }

    }
}