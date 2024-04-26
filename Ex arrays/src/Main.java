import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cantina cantina = new Cantina("Catina do inatel");
        boolean flag = true;
        int escolha = 0;
        Scanner cin = new Scanner(System.in);
        Salgado salgado = new Salgado();

        while(flag){
            System.out.println("Escolha uma opção: (1)Adc salgado (2)Mostrar salgados (3)Sair");

            escolha = cin.nextInt();

            switch(escolha){
                case 1:
                    String nomesalg;
                    
                    System.out.println("Digite o nome do salgado");
                    cin.nextLine();
                    nomesalg = cin.nextLine();
                    salgado.nome = nomesalg;
                    cantina.addsalgado(salgado);
                    break;
                case 2:
                    cantina.mostrainfo();
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }



    }
}