public class Main {
    public static void main(String[] args) {

        Computador computadores[] = new Computador[3];

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

        //Todos adicionados na lista de computadores.

        computador1.mostraPCConfigs();




    }
}
