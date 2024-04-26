import java.util.Scanner;
public class Motor {

    String cilindradas;
    float velocidadeMaxima;


    String cilindrada1 = "50";
    String cilindrada2 = "100";
    String cilindrada3 = "150";

    public Motor(){
        System.out.println("--Criando motor--");
        Scanner entrada = new Scanner(System.in);
        int escolha = 0;

        System.out.println("Escolha o tipo de cilindrada: (1->50) (2->100) (3->150)");
        do{
            escolha = entrada.nextInt();
            switch(escolha) {
                case 1:
                    this.cilindradas = "50";
                    break;
                case 2:
                    this.cilindradas = "100";
                    break;
                case 3:
                    this.cilindradas = "150";
                    break;
                default:
                    System.out.println("Escolha incorreta, tente novamente: ");
                    break;
                }

        }while(escolha != 1 && escolha != 2 && escolha != 3);

        System.out.println("Digite a velocidade máxima deste motor: (0-150)");
        do{
            escolha = entrada.nextInt();

            if(escolha > 150 || escolha < 0)
                System.out.println("Escolha incorreta, tente novamente!");
            else
                velocidadeMaxima = escolha;
        }while(escolha > 150 || escolha < 0);

        entrada.close();
    }

    void mostrainfo(){

        System.out.println("Quantidade de cilindradas: "+ this.cilindradas);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);

    }


}
