public class Computador {
    String marca;
    float preco;
    MemoriaUSB memoria = new MemoriaUSB();
    SistemaOperacional sistema = new SistemaOperacional();
    HardwareBasico hardware = new HardwareBasico();


    public Computador(java.lang.String marca, float preco, SistemaOperacional sistema, HardwareBasico hardware) {
        this.marca = marca;
        this.preco = preco;
        this.sistema = sistema;
        this.hardware = hardware;
    }


    public void mostraPCConfigs(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: R$" + this.preco);
        System.out.println(this.hardware.nome);

        if(this.hardware.capacidade==500f)
            System.out.printf("500Gb de HD");
        if(this.hardware.capacidade==1000f)
            System.out.printf("1Tb de HD");
        if(this.hardware.capacidade==2000f)
            System.out.printf("2Tb de HD");

        System.out.println("\nSistema Operacional " + this.sistema.nome + " (" + this.sistema.tipo + "bits)");

        if(this.memoria != null){
            System.out.println("Acompanha " + this.memoria.nome + " de " + this.memoria.capacidade + "Gb");
        }
    }
    public void addMemoriaUSB(MemoriaUSB memoria1){
        this.memoria = memoria1;
    }
}
