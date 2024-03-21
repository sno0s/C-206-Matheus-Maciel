public class Computador {
    String Marca;
    float preco;
    MemoriaUSB memoria = new MemoriaUSB();
    SistemaOperacional sistema = new SistemaOperacional();
    HardwareBasico hardware = new HardwareBasico();


    public Computador(java.lang.String marca, float preco, SistemaOperacional sistema, HardwareBasico hardware) {
        Marca = marca;
        this.preco = preco;
        this.sistema = sistema;
        this.hardware = hardware;
    }


    public void mostraPCConfigs(){

    }
    public void addMemoriaUSB(){

    }
}
