public class Funcionario {
    int idade;
    java.lang.String nome;
    double salario;

    public Funcionario()
    {
        System.out.println("--Criando funcionário--");

        this.nome = "";
        this.idade = 18;
        this.salario = 1340.0;
    }


    public double calculaSalarioAnual(){
        double salAnual = salario * 12;

        return salAnual;
    }

    public double calculaDecimoTerceiro(){
        double salAnual = salario * 13;

        return salAnual;
    }

    public void mostrarinfos(){
        System.out.println("Nome do funcionário: " + this.nome);
        System.out.println("Idade do funcionário: " + this.idade);
        System.out.println("Salario do funcionário: " + this.salario);
    }

}
