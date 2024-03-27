import java.util.Scanner;
public class Microfone {
    String material;

    public Microfone() {
        Scanner entrada = new Scanner(System.in);
        int escolha;
        System.out.println("Selecione o material do microfone do rapper:\n(1)Dourado (2)Madeira (3)Plástico");

        do{
            escolha = entrada.nextInt();
            if(escolha != 1 && escolha !=2 && escolha !=3)
                System.out.println("---Escolha incorrenta, tente novamente!\n\nSelecione o material do microfone do rapper:\n(1)Dourado (2)Madeira (3)Plástico");

        }while(escolha != 1 && escolha !=2 && escolha !=3);

        switch(escolha){
            case 1:
                this.material = "Dourado";
                break;
            case 2:
                this.material = "Madeira";
                break;
            case 3:
                this.material = "Plástico";
                break;
        }
        //entrada.close();
    }
}
