public class Main {
    public static void main(String[] args) {
        //Criando duas Instancias !!!!
        Funcionario func1 = new Funcionario();
        func1.nome = "Eduardo";
        func1.idade = 20;
        func1.salario = 1100;

        Funcionario func2 = new Funcionario();
        func2.nome = "Gabriel";
        func2.idade = 21;
        func2.salario = 800;

        func1.mostrarinfos();
        func2.mostrarinfos();


    }
}