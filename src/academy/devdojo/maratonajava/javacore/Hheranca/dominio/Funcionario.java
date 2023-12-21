package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicializacao estático de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicializacao 1 de funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicializacao 2 de funcionario");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");

    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu "+nome + "recebi o salário de "+salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
