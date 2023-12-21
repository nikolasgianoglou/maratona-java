package academy.devdojo.maratonajava.javacore.BIntroducaometodos.dominio;

public class Funcionario {
    private String nome = null;
    private int idade = 0;
    private double[] salarios = null;
    private double media;

    public void imprimirDados() {
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Idade do funcionário: " + idade);
        System.out.println("3 últimos salários do funcionário: ");
        if (salarios == null) {
            System.out.println("Não há registro do salário desse trabalhador");
            return;
        }
        for(double salario: salarios) {
            System.out.println(salario);
        }
    }

    public void imprimirMediaSalarios() {
        if (salarios == null) {
            System.out.println("Não há registro do salário desse trabalhador para fazer uma média");
            return;
        }
        double soma = 0;
        for (int i = 0; i < salarios.length; i++) {
            soma += salarios[i];
        }
        media = soma / salarios.length;
        System.out.println("A média dos 3 últimos salários do funcionário "+nome+" foi de R$"+media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
